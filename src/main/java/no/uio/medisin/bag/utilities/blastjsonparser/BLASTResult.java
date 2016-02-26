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
public class BlastResult {
    private final BlastOutput2                          BlastOutput2;
    
    public BlastResult(){
        BlastOutput2          = new BlastOutput2();
    }

    /**
     * @return the BlastOutput2
     */
    public BlastOutput2 getBlastOutput2() {
        return BlastOutput2;
    }
}
