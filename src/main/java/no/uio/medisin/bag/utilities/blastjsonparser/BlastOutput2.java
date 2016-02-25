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
public class BlastOutput2 {
    private final Report                                report;
    private final String                                db                      =  "";
    
    public BlastOutput2(){
        report          = new Report();
    }

    /**
     * @return the report
     */
    public Report getReport() {
        return report;
    }
}
