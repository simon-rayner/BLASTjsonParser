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
public class Stat {
    private final int                                   db_num               =  0;
    private final int                                   db_len               =  0;
    private final int                                   hsp_len              =  0;
    private final int                                   eff_space            =  0;
    private final double                                kappa                =  0.0;
    private final double                                lambda               =  0.0;
    private final double                                entropy              =  0.0;

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
