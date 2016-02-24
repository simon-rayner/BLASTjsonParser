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
    private final Params                                params;
    private final Results                               results;
    private final String                                gap_extend              =  "";
    
    
    public Report(){
        search_target   = new SearchTarget();
        params          = new Params();
        results         = new Results();
    }
}
