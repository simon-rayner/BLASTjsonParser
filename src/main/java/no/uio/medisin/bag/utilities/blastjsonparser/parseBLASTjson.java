/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static no.uio.medisin.bag.utilities.blastjsonparser.parseBLASTjson.logger;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author simonray
 */
public class parseBLASTjson {
    
    static Logger logger = LogManager.getRootLogger();
//    static Logger                   logger                          = LogManager.getLogger();
    private static BlastResult   blastResult = new BlastResult();
    
    public static void main(String [] args){
//    static Logger logger = LogManager.getRootLogger();
        
	ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);

        //logger.info("read pipeline file <" + this.getPipelineFile() + ">");
        try{
            //    private PipelineData                pipelineData    = new PipelineData();
            String filename = "/data/ngsdata/sweden/msy.vs.hsa/msy.smallRNAs.count_gt_1000.1_to_10/CSR39AJG01R-Alignment.json/CSR39AJG01R_1.json";
            //pipelineData = mapper.readValue(new File(this.getPipelineFile()), PipelineData.class);
            blastResult = mapper.readValue(new File(filename), BlastResult.class);
            logger.info(blastResult.toString());
            logger.info("done");
            
            logger.info(blastResult.getBlastOutput2().getReport().getParams());
            
        }
        catch(Exception ex){
            //logger.error("error reading <" + this.getPipelineFile() + ">");
            logger.error(ex.toString());
            //throw new Exception("error reading <" + this.getPipelineFile() + ">");
        }
        logger.info("done");
//        logger.info(getPipelineData().toString());
        
    }
}
