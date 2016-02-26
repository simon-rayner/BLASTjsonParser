/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author simonray
 */
public class BLASTSearchParameters {
    private String                                query_id                =  "";
    private String                                query_title             =  "";
    private int                                   query_len               =  0;
    private String                                num                     =  "";
    private ArrayList<BLASTHit>                   hits;
    private BLASTStats                            stat;
    
    public BLASTSearchParameters(){
        hits = new ArrayList<>();
        stat = new BLASTStats();
    }

    
    

    /**
     * Filter hits based on queryLen and alignLen
     * 
     * @param queryL
     * @param alignL 
     * @return boolean
     */
    public Boolean filter(int queryL, int alignL){
        
        if(this.getQuery_len() < queryL)   
            return false;
        
        
        for(BLASTHit hit: this.getHits()){
            hit.filter(queryL, alignL);
        }
        
        
        return true;
        
    }
    
    
    
    
    
    /**
     * filter each Hit by query len and align len, and report a Hit if it passes
     * 
     * @param queryL
     * @param alignL
     * @return 
     * 
     */
    public String filterAndReport(int queryL, int alignL){
        if(this.getQuery_len() < queryL)   
            return "fail";
        
        String reportString = "";
        for(BLASTHit hit: this.getHits()){
            reportString = reportString.concat(hit.filterAndReport(queryL, alignL)+"\n");
        }
        
        return reportString;
        
    }
    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        String searchString 
                = "queryID   :\t" + this.getQuery_id()
                + "queryTitle:\t" + this.getQuery_title()
                + "queryLen  :\t" + this.getQuery_len()
                + "num       :\t" + this.getNum()
                + "Stats     :\n"
                + "+" + StringUtils.repeat("-", 20) + "-" + "\n";
        searchString = searchString.concat(this.getStat().toString());
        searchString = searchString.concat("+" + StringUtils.repeat("-", 20) + "-" + "\n");
        
        for(BLASTHit hit: this.getHits()){
            searchString = searchString.concat(hit.toString());
        }
        
        return searchString;
                        
        
    }
    /**
     * @return the query_id
     */
    public String getQuery_id() {
        return query_id;
    }

    /**
     * @return the query_title
     */
    public String getQuery_title() {
        return query_title;
    }

    /**
     * @return the query_length
     */
    public int getQuery_len() {
        return query_len;
    }

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @return the hits
     */
    public ArrayList<BLASTHit> getHits() {
        return hits;
    }

    /**
     * @return the stat
     */
    public BLASTStats getStat() {
        return stat;
    }
}


