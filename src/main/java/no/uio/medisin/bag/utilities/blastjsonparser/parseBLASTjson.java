/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static no.uio.medisin.bag.utilities.blastjsonparser.parseBLASTjson.logger;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author simonray
 */
public class parseBLASTjson {
    
    static Logger logger = LogManager.getRootLogger();
    static Options options = new Options();
    
    private static BLASTSingleResult   blastSingleResult ;
    private static BLASTMultiResult   blastMultiResult;
    
    private static String blastFileList;
    private static int minQueryLen;
    private static int minAlignLen;
    private static String outputResultFile;
    private static Boolean multiJson;
    
    private static ArrayList<String> blastFiles = new ArrayList<>();
    
    public static void main(String [] args){
        
	ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        try{
            parseArguments(args);        
        }
        catch(Exception exEx){
            logger.error("error parsing Arguments");
            System.exit(-1);
        }

        String line ="";
        logger.info("reading Blast Results Input file <" + blastFileList + ">");
        try(BufferedReader br = new BufferedReader(new FileReader(new File(blastFileList)))){
            while((line=br.readLine())!=null){
                blastFiles.add(line.trim());        
                logger.info("--" + line);
            }
            br.close();
            logger.info("read " + blastFiles.size() + " lines");
        }
        catch(IOException exIO){
            logger.error("error reading <" + blastFiles + ">");
            logger.error(exIO.toString());
        }

        logger.info("parsing Blast file list");
        
        try{
            if(multiJson){
                filterMultiJsonResult();
            }
            else{
                filterSingleJsonResult();
            }
        }
        catch(IOException exIO){
            logger.error("error filtering BLAST results");
            logger.error("see log file for details");
            logger.error(exIO.toString());
            System.exit(-1);
        }
        logger.info("done");
        
    }

    /**
     * @return the multiJson
     */
    public static Boolean getMultiJson() {
        return multiJson;
    }

    /**
     * @param aMultiJson the multiJson to set
     */
    public static void setMultiJson(Boolean aMultiJson) {
        multiJson = aMultiJson;
    }
    
    
    
    
    /**
     * results are stored with multiple BLAST json queries per file
     * @ throws IOException
     */
    private static void filterMultiJsonResult(){
	ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        blastMultiResult  = new BLASTMultiResult();
        
        BufferedWriter bw;
        String currentBlastFile = null;
        try{
            if(outputResultFile == null){
                bw = new BufferedWriter(new OutputStreamWriter(System.out));
            }else{
                bw = new BufferedWriter(new FileWriter(new File(outputResultFile)));
            }
            
            for(String blastFile: blastFiles){
                currentBlastFile = blastFile;
                logger.info("parsing BLAST result file <" + currentBlastFile + ">");
                blastMultiResult = mapper.readValue(new File(blastFile), BLASTMultiResult.class);
                logger.info("filtering results");
                for(BLASTReport blastReport: blastMultiResult.getBlastOutput2().getReports()){
                    logger.info("filtering " + blastReport.getParams().getQuery_id());
                    bw.write(blastReport.filterAndReport(minQueryLen, minAlignLen) + "\n\n");
                    logger.info("completed");                                   
                }
            }

            bw.close();
            logger.info("finished all files");
            
        }
        catch(IOException ex){
            logger.error("error parsing <" + currentBlastFile + ">");
            logger.error(ex.toString());
        }
    }
    
    
    
    
    /**
     * results are stored single BLAST query per file
     * @ throws IOException
     */
    private static void filterSingleJsonResult() throws IOException{
        
	ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        blastSingleResult = new BLASTSingleResult();
        
        BufferedWriter bw;
        String currentBlastFile = null;
        try{
            if(outputResultFile == null){
                bw = new BufferedWriter(new OutputStreamWriter(System.out));
            }else{
                bw = new BufferedWriter(new FileWriter(new File(outputResultFile)));
            }
            
            for(String blastFile: blastFiles){
                currentBlastFile = blastFile;
                logger.info("parsing BLAST result file <" + currentBlastFile + ">");
                blastSingleResult = mapper.readValue(new File(blastFile), BLASTSingleResult.class);
                logger.info("filtering results");
                bw.write(blastSingleResult.getBlastOutput2().filterAndReport(minQueryLen, minAlignLen) + "\n\n");
                logger.info("completed");               
            }

            bw.close();
            logger.info("finished all files");
                        
        }
        catch(IOException ex){
            logger.error("error parsing <" + currentBlastFile + ">");
            logger.error(ex.toString());
        }
        
    }
    
    /**
     * parse out run arguments
     * 
     * @param args 
     * @throws Exception
     */
    public static void parseArguments(String args[]) throws Exception{
        
        
        logger.info("parse arguments");
        options.addOption("h", "help",      false,  "view help");
        options.addOption("b", "blast_file_list",       true,   "BLAST results file list");
        options.addOption("q", "min_query_len",    true,   "min query length");
        options.addOption("a", "min_align_length",      true,   "min align length");
        options.addOption("o", "output",     true,   "output file");
        options.addOption("M", "multi", false, "results files contain multiple BLAST results");
        options.addOption("S", "single", false, "results files contain single BLAST result");
        
        CommandLineParser clParser = new BasicParser();
        CommandLine cmd = null;
        
        
        try{
            cmd = clParser.parse(options, args);
                
            if(cmd.hasOption("h")){
                printHelp();
            }
            if (cmd.hasOption("b")) {
                blastFileList = cmd.getOptionValue("b");
                logger.info("Blast Results Input File set to <" + blastFileList + ">");
            }                    
            else
                throw new ParseException("no Blast Results Input file was specified") ;
            
            if (cmd.hasOption("q")) {
                minQueryLen = Integer.parseInt(cmd.getOptionValue("q"));
                logger.info(" in Query length set to " + minQueryLen);
            }                    
            else
                throw new ParseException("no Min Query Len was specified") ;
            
            if (cmd.hasOption("a")) {
                minAlignLen = Integer.parseInt(cmd.getOptionValue("a"));
                logger.info("min Align Length set to :" + cmd.getOptionValue("a"));
            }                    
            else
                throw new ParseException("no Min Align Len was specified") ;
            
            if (cmd.hasOption("o")) {
                outputResultFile = cmd.getOptionValue("o");
                logger.info("output summary file set to <" + outputResultFile + ">");
            }
            else
                outputResultFile = null;
            
            if (cmd.hasOption("M") && cmd.hasOption("S")){
                logger.error("you cannot specify both 'M' and 'S' in the parameters ");
                throw new ParseException("you cannot specify both 'M' and 'S' in the parameters ");

            }
            if (cmd.hasOption("M")){
                multiJson = true;
                logger.info("BLAST result files contain multiple entries ");
            }
            if(cmd.hasOption("S")){
                multiJson = false;
                logger.info("BLAST result files contain single entries ");
            }
            
        }
        catch(ParseException exPa){
            logger.error("Error parsing run parameters");
            logger.error(exPa.toString());
            throw new Exception("Run terminated unexpectedly while parsing run parameters\n"
                    + "see log file for details"
            );
        }
    }
    
    
    
    
    /**
     * print command line usage
     * 
     */
    public static void printHelp(){
        printBanner();
        HelpFormatter formatter = new HelpFormatter();

        formatter.printHelp("command line options", options);
        
        System.exit(0);
        
    }
    

    
    
    
    /**
     * print program info
     * 
     */
    public static void printBanner(){
        logger.info("\n\n\n"
                + "    =======================================================================\n"
                + "    |  BLAST JSON Parser:                                                 |\n"
                + "    |    classes to parse out the various levels of a BLAST result        |\n"
                + "    |    The program expects a list of JSON result files, one for         |\n"
                + "    |    each query sequence (rather than multiple queries in a single    |\n"
                + "    |    JSON file.                                                       |\n"
                + "    =======================================================================\n\n\n");
        
        logger.info("*** report bugs to simon.rayner@medisin.uio.no\n");
    }

    /**
     * @return the blastFileList
     */
    public static String getBlastFileList() {
        return blastFileList;
    }

    /**
     * @param aBlastFileList the blastFileList to set
     */
    public static void setBlastFileList(String aBlastFileList) {
        blastFileList = aBlastFileList;
    }

    /**
     * @return the minQueryLen
     */
    public static int getMinQueryLen() {
        return minQueryLen;
    }

    /**
     * @param aMinQueryLen the minQueryLen to set
     */
    public static void setMinQueryLen(int aMinQueryLen) {
        minQueryLen = aMinQueryLen;
    }

    /**
     * @return the minAlignLen
     */
    public static int getMinAlignLen() {
        return minAlignLen;
    }

    /**
     * @param aMinAlignLen the minAlignLen to set
     */
    public static void setMinAlignLen(int aMinAlignLen) {
        minAlignLen = aMinAlignLen;
    }

    /**
     * @return the outputResultFile
     */
    public static String getOutputResultFile() {
        return outputResultFile;
    }

    /**
     * @param aOutputResultFile the outputResultFile to set
     */
    public static void setOutputResultFile(String aOutputResultFile) {
        outputResultFile = aOutputResultFile;
    }
    
    
}
