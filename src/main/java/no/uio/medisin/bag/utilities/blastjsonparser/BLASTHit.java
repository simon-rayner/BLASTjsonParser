/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author simonray
 */
public class BLASTHit {
    
    private String                                num                 =  "";
    private ArrayList<BLASTHitDescription>                description;
    private int                                   len                 =  0;
    private ArrayList<BLASTHighScoringSegmentPair>     hsps;

    
    public BLASTHit(){
        description = new ArrayList<>();
        hsps = new ArrayList<>();
    }    

    
    
    
    /**
     * Filter hits based on queryLen and alignLen
     * 
     * @param queryL
     * @param alignL 
     * @return boolean
     */
    public Boolean filter(int queryL, int alignL){
        BLASTHighScoringSegmentPair thishsps = (BLASTHighScoringSegmentPair) this.getHsps().get(0);
        return thishsps.filter(queryL, alignL);
    }
    
    
    
    
    /**
     * if the Hit passes filter, then return a summary string
     * We only consider the best hit.
     * 
     * @param queryL
     * @param alignL
     * @return 
     */
    public String filterAndReport(int queryL, int alignL){
        BLASTHighScoringSegmentPair thishsps = (BLASTHighScoringSegmentPair) this.getHsps().get(0);
        if (thishsps.filter(queryL, alignL)==false){
            return description.get(0).getAccession()
                    + "\t" + description.get(0).getSciname()
                    + "\t" + thishsps.getHseq() 
                    + "\t" + thishsps.getMidline()
                    + "\t" + thishsps.getQseq()
                    + "\t" + thishsps.getEvalue();
        }
        return "";
    }
    
    
    
    
    
    
    /**
     * Stringify this instance
     * 
     * @return 
     */
    @Override
    public String toString(){
                
        String hitString =
                "num          :\t" + this.getNum() + "\n"
             +  "len          :\t" + this.getLen() + "\n"
                + "description:" + "\n"
                + "+" + StringUtils.repeat("-", 20) + "-" + "\n";
                
        for(BLASTHighScoringSegmentPair thishsps: this.getHsps()){
            hitString = hitString.concat(thishsps.toString() + "\n");
        }
        hitString = hitString.concat("+" + StringUtils.repeat("-", 20) + "-" + "\n");

        
        hitString = hitString.concat("Description\n");
        hitString = hitString.concat("+" + StringUtils.repeat("-", 20) + "-" + "\n");
        for(BLASTHitDescription thisDescription: this.getDescription()){
            hitString = hitString.concat(thisDescription.toString() + "\n");            
        }
        hitString = hitString.concat("+" + StringUtils.repeat("-", 20) + "-" + "\n");

        return hitString;
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
    public ArrayList<BLASTHitDescription> getDescription() {
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
    public ArrayList<BLASTHighScoringSegmentPair> getHsps() {
        return hsps;
    }
    
}


