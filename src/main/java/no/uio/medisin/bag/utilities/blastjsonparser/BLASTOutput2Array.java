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
    private ArrayList<BLASTOutput2>                BlastOutput2;
//    private String                                db                      =  "";
    
    public BLASTOutput2Array(){
        BlastOutput2          = new ArrayList<>();
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
        for(BLASTOutput2 blastoutput2: BlastOutput2){
            String thisReportString = blastoutput2.filterAndReport(queryL, alignL);
            if(thisReportString.isEmpty()==false){
                reportsString = reportsString.concat(blastoutput2.toString() + "\n");
                
            }
        }
        return reportsString;
    }
    
    
    
    
    /**
     * @return the report
     */
    public ArrayList<BLASTOutput2> getReports() {
        return BlastOutput2;
    }
    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        String reportsString = "";
        for(BLASTOutput2 blastoutput2: BlastOutput2){
            reportsString = reportsString.concat(blastoutput2.toString() + "\n");
        }
        return reportsString;
    }
}
