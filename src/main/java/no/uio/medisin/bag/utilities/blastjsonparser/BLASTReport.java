/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

/**
 *
 * @author simonray
 */
public class BLASTReport {
    private  String                                program                 =  "";
    private  String                                version                 =  "";
    private  String                                reference               =  "";
    
    private  SearchTarget                          search_target;
    private  BLASTParams                           params;
    private  BLASTResults                          results;
    
    
    public BLASTReport(){
        search_target   = new SearchTarget();
        params          = new BLASTParams();
        results         = new BLASTResults();
    }

    
    
    
    
    /**
     * Filter hits based on queryLen and alignLen
     * 
     * @param queryL
     * @param alignL 
     * @return Boolean
     * 
     */
    public Boolean filterHits(int queryL, int alignL){
        return this.getResults().filter(queryL, alignL);
    }
    
    
    
    
    /**
     * filter search result by query Len. If the length is too short then skip
     * 
     * @param queryL
     * @param alignL
     * @return String
     * 
     */
    public String filterAndReport(int queryL, int alignL){
        return this.getResults().filterAndReport(queryL, alignL);
    }
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        
      String reportString 
              = "program:  \t" + program + "\n"
              + "version:  \t" + version + "\n"
              + "reference:\t" + reference + "\n";
      
      reportString = reportString.concat(params.toString() + "\n");
      
      reportString = reportString.concat(results.toString() + "\n");
      
      
      return reportString;
        
    }
    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @return the search_target
     */
    public SearchTarget getSearch_target() {
        return search_target;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @return the params
     */
    public BLASTParams getParams() {
        return params;
    }

    /**
     * @return the results
     */
    public BLASTResults getResults() {
        return results;
    }
}
