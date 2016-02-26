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
public class BLASTSingleResult {
    private BLASTOutput2                          BlastOutput2;
    
    public BLASTSingleResult(){
        BlastOutput2          = new BLASTOutput2();
    }

    /**
     * @return the BlastOutput2
     */
    public BLASTOutput2 getBlastOutput2() {
        return BlastOutput2;
    }
    
    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "blastOutput2:\t" + BlastOutput2.toString() + "\n";
    }

}
