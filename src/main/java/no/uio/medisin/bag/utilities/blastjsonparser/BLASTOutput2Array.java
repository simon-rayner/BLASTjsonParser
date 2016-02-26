/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

import java.util.ArrayList;

/**
 *
 * @author simonray
 */
public class BLASTOutput2Array {
    private ArrayList<BLASTReport>                reports;
    private String                                db                      =  "";
    
    public BLASTOutput2Array(){
        reports          = new ArrayList<>();
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
        String reportsString = "";
        for(BLASTReport blastReport: reports){
            String thisReportString = blastReport.filterAndReport(queryL, alignL);
            if(thisReportString.isEmpty()==false){
                reportsString = reportsString.concat(blastReport.toString() + "\n");
                
            }
        }
        return reportsString;
    }
    
    
    
    
    /**
     * @return the report
     */
    public ArrayList<BLASTReport> getReports() {
        return reports;
    }
    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        String reportsString = "";
        for(BLASTReport blastReport: reports){
            reportsString = reportsString.concat(blastReport.toString() + "\n");
        }
        return reportsString;
    }
}
