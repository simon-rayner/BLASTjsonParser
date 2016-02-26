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
public class BLASTParams {
    private String                                query_id                =  "";
    private String                                expect                  =  "";
    private String                                sc_match                =  "";
    private String                                sc_mismatch             =  "";
    private String                                gap_open                =  "";
    private String                                filter                  =  "";
    private String                                entrez_query            =  "";
    private String                                gap_extend              =  "";

    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     * 
     */
    @Override
    public String toString(){
        
        return 
        "expect:\t" + this.getExpect() 
          + "sc_match    :\t" +  this.getSc_match() + "\n"
          + "sc_mismatch :\t" + this.getSc_mismatch() + "\n"
          + "gap_open    :\t"  + this.getGap_open() + "\n"
          + "gap_extend  :\t" + this.getGap_extend() + "\n"
          + "filter      :\t" + this.getFilter() + "\n"
          + "entrez_query:\t" + this.getEntrez_query(); 
        
    }
    
    
    /**
     * @return the query_id
     */
    public String getQuery_id() {
        return query_id;
    }

    /**
     * @return the expect
     */
    public String getExpect() {
        return expect;
    }

    /**
     * @return the sc_match
     */
    public String getSc_match() {
        return sc_match;
    }

    /**
     * @return the sc_mismatch
     */
    public String getSc_mismatch() {
        return sc_mismatch;
    }

    /**
     * @return the gap_open
     */
    public String getGap_open() {
        return gap_open;
    }

    /**
     * @return the filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * @return the entrez_query
     */
    public String getEntrez_query() {
        return entrez_query;
    }

    /**
     * @return the gap_extend
     */
    public String getGap_extend() {
        return gap_extend;
    }
    
}
