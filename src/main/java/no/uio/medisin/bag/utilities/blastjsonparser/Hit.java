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
    
    private final String                                num                 =  "";
    private final ArrayList<Description>                description;
    private final int                                   len                 =  0;
    private final ArrayList<HighScoringSegmentPair>     hsps;

    
    public Hit(){
        description = new ArrayList<>();
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
    public ArrayList<Description> getDescription() {
        return description;
    }

    /**
     * @return the length
     */
    public int getLen() {
        return len;
    }

    /**
     * @return the hsps
     */
    public ArrayList<HighScoringSegmentPair> getHsps() {
        return hsps;
    }
    
}


