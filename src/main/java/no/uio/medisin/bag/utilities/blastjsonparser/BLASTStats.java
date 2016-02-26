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
public class BLASTStats {
    private int                                   db_num               =  0;
    private int                                   db_len               =  0;
    private int                                   hsp_len              =  0;
    private int                                   eff_space            =  0;
    private double                                kappa                =  0.0;
    private double                                lambda               =  0.0;
    private double                                entropy              =  0.0;

    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        return 
                  "dbNum    :\t" + this.getDb_num() + "\n"
                + "dbLen    :\t" + this.getDb_len() + "\n"
                + "hspLen   :\t" + this.getHsp_len() + "\n"
                + "effSpace :\t" + this.getEff_space() + "\n"
                + "kappa    :\t" + this.getKappa() + "\n"
                + "lamba    :\t" + this.getLambda() + "\n"
                + "entropy  :\t" + this.getEntropy();
    }
    /**
     * @return the db_num
     */
    public int getDb_num() {
        return db_num;
    }

    /**
     * @return the db_len
     */
    public int getDb_len() {
        return db_len;
    }

    /**
     * @return the hsp_len
     */
    public int getHsp_len() {
        return hsp_len;
    }

    /**
     * @return the eff_space
     */
    public int getEff_space() {
        return eff_space;
    }

    /**
     * @return the kappa
     */
    public double getKappa() {
        return kappa;
    }

    /**
     * @return the lambda
     */
    public double getLambda() {
        return lambda;
    }

    /**
     * @return the entropy
     */
    public double getEntropy() {
        return entropy;
    }
    
}
