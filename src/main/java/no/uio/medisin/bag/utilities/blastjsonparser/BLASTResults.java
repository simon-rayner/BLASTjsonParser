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
public class BLASTResults {

    private BLASTSearchParameters search;
    
    public BLASTResults(){
        search = new BLASTSearchParameters();
    }
    
    
    
    
    /**
     * Filter hits based on queryLen and alignLen
     * 
     * @param queryL
     * @param alignL 
     * @return boolean
     * 
     */
    public Boolean filter(int queryL, int alignL){       
        return search.getQuery_len() >= queryL;
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
        if(search.getQuery_len() >= queryL){
            return search.getQuery_title() + "\t" 
                    + search.filterAndReport(queryL, alignL);
        }
        return search.getQuery_title() + "\t" 
                + "query_len = " + search.getQuery_len() 
                + "(<" + queryL + ") skipping" + "\n";
    }
    

    
    
    @Override
    public String toString(){
        return search.toString();
    }
}
