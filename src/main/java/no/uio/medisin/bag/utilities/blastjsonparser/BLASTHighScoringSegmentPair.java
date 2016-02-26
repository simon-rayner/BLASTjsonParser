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
public class BLASTHighScoringSegmentPair {
    
    private int        num              =  0;
    private double     bit_score        =  0.0;
    private int        score            = 0;
    private double     evalue           = 0.0;
    private int        identity         = 0;
    private int        query_from       = 0;
    private int        query_to         = 0;
    private String     query_strand     = "";
    private int        hit_from         = 0;
    private int        hit_to           = 0;
    private String     hit_strand       = "";
    private int        align_len        = 0;
    private int        gaps             = 0;
    private String     qseq             = "";
    private String     hseq             = "";
    private String     midline          = "";

    

    
    /**
     * Filter hits based on queryLen and alignLen
     * 
     * @param queryL
     * @param alignL 
     * @return boolean
     * 
     */
    public Boolean filter(int queryL, int alignL){
        return this.getAlign_len()<alignL;
    }

    
    
    
    
    public String filterAndReport(int queryL, int alignL){
        if(this.getAlign_len()<alignL){
            return Integer.toString(align_len);
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
        return
                  "num" + this.getNum()
                    + "bit_score   :\t" + this.getBit_Score() + "\n"
                    + "score       :\t" + this.getScore() + "\n"
                    + "evalue      :\t" + this.getEvalue() + "\n"
                    + "identity    :\t" + this.getIdentity() + "\n"
                    + "query_from  :\t" + this.getQuery_from() + "\n"
                    + "query_to    :\t" + this.getQuery_to() + "\n"
                    + "query_strand:\t" + this.getQuery_strand() + "\n"
                    + "hit_from    :\t" + this.getHit_from() + "\n"
                    + "hit_to      :\t" + this.getHit_to() + "\n"
                    + "hit_strand  :\t" + this.getHit_strand() + "\n"
                    + "align_len   :\t" + this.getAlign_len() + "\n"
                    + "gaps        :\t" + this.getGaps() + "\n"
                    + "qseq        :\t" + this.getQseq() + "\n"
                    + "midline     :\t" +  this.getMidline() + "\n"
                    + "hseq        :\t" + this.getHseq();
                }
  
    
    
    
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @return the bitScore
     */
    public double getBit_Score() {
        return bit_score;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @return the evalue
     */
    public double getEvalue() {
        return evalue;
    }

    /**
     * @return the identity
     */
    public int getIdentity() {
        return identity;
    }

    /**
     * @return the query_from
     */
    public int getQuery_from() {
        return query_from;
    }

    /**
     * @return the query_to
     */
    public int getQuery_to() {
        return query_to;
    }

    /**
     * @return the query_strand
     */
    public String getQuery_strand() {
        return query_strand;
    }

    /**
     * @return the hit_from
     */
    public int getHit_from() {
        return hit_from;
    }

    /**
     * @return the hit_to
     */
    public int getHit_to() {
        return hit_to;
    }

    /**
     * @return the hit_strand
     */
    public String getHit_strand() {
        return hit_strand;
    }

    /**
     * @return the align_len
     */
    public int getAlign_len() {
        return align_len;
    }

    /**
     * @return the gaps
     */
    public int getGaps() {
        return gaps;
    }

    /**
     * @return the qseq
     */
    public String getQseq() {
        return qseq;
    }

    /**
     * @return the hseq
     */
    public String getHseq() {
        return hseq;
    }

    /**
     * @return the midline
     */
    public String getMidline() {
        return midline;
    }
    
}
