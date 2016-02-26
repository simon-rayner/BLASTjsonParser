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
public class BLASTMultiResult {
    private BLASTOutput2Array                          BlastOutput2;
    
    public BLASTMultiResult(){
        BlastOutput2          = new BLASTOutput2Array();
    }

    /**
     * @return the BlastOutput2
     */
    public BLASTOutput2Array getBlastOutput2() {
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
