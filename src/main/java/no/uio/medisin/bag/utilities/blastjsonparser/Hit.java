/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

import java.util.ArrayList;

/**
 *
 * @author simonray
 */
public class Hit {
    
    private final String                                num                  =  "";
    private final Description                           description          ;
    private final int                                   length               =  0;
    private final ArrayList<HighScoringSegmentPair>     hsps;

    
    public Hit(){
        description = new Description();
        hsps = new ArrayList<>();
    }    

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @return the description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @return the hsps
     */
    public ArrayList<HighScoringSegmentPair> getHsps() {
        return hsps;
    }
    
}


