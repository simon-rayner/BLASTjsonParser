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
        return getSearch().getQuery_len() >= queryL;
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
        if(getSearch().getQuery_len() >= queryL){
            return getSearch().getQuery_title() + "\t" 
                    + getSearch().filterAndReport(queryL, alignL);
        }
        return getSearch().getQuery_title() + "\t" 
                + "query_len = " + getSearch().getQuery_len() 
                + "(<" + queryL + ") skipping" + "\n";
    }
    

    
    
    @Override
    public String toString(){
        return getSearch().toString();
    }

    /**
     * @return the search
     */
    public BLASTSearchParameters getSearch() {
        return search;
    }
}
