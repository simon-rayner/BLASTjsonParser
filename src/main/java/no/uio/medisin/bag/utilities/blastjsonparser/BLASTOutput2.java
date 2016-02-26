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
public class BLASTOutput2 {
    private BLASTReport                           report;
    private String                                db                      =  "";
    
    public BLASTOutput2(){
        report          = new BLASTReport();
    }

    
    /**
     * Filter hits based on queryLen and alignLen
     * 
     * @param queryL
     * @param alignL 
     * @return boolean
     */
    public Boolean filter(int queryL, int alignL){
        return this.getReport().filterHits(queryL, alignL);
    }

    
    /**
     * filter by query len and align len and report what passes
     * 
     * @param queryL
     * @param alignL
     * @return 
     * 
     */
    public String filterAndReport(int queryL, int alignL){
        return this.getReport().filterAndReport(queryL, alignL);
    }
    
    /**
     * @return the report
     */
    public BLASTReport getReport() {
        return report;
    }
    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "report:\t" + report.toString() + "\n";
    }
}
