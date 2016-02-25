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
public class Report {
    private final String                                program                 =  "";
    private final String                                version                 =  "";
    private final String                                reference               =  "";
    
    private final SearchTarget                          search_target;
    private final BLASTParams                                params;
    private final Results                               results;
    
    
    public Report(){
        search_target   = new SearchTarget();
        params          = new BLASTParams();
        results         = new Results();
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
    public Results getResults() {
        return results;
    }
}
