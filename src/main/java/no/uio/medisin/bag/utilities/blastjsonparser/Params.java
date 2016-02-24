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
public class Params {
    private final String                                query_id                =  "";
    private final String                                expect                  =  "";
    private final String                                sc_match                =  "";
    private final String                                sc_mismatch             =  "";
    private final String                                gap_open                =  "";
    private final String                                filter                  =  "";
    private final String                                entrez_query            =  "";
    private final String                                gap_extend              =  "";

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
