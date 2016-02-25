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
public class HighScoringSegmentPair {
    
    private final int        num              =  0;
    private final double     bit_score        =  0.0;
    private final int        score            = 0;
    private final double     evalue           = 0.0;
    private final int        identity         = 0;
    private final int        query_from       = 0;
    private final int        query_to         = 0;
    private final String     query_strand     = "";
    private final int        hit_from         = 0;
    private final int        hit_to           = 0;
    private final String     hit_strand       = "";
    private final int        align_len        = 0;
    private final int        gaps             = 0;
    private final String     qseq             = "";
    private final String     hseq             = "";
    private final String     midline          = "";

    
    
    @Override
    public String toString(){
        return
                  "num" + this.getNum()
                    + "bit_score" + this.getBit_Score()
                    + "score" + this.getScore()
                    + "evalue" + this.getEvalue()
                    + "identity" + this.getIdentity()
                    + "query_from" + this.getQuery_from()
                    + "query_to" + this.getQuery_to()
                    + "query_strand" + this.getQuery_strand()
                    + "hit_from" + this.getHit_from()
                    + "hit_to" + this.getHit_to()
                    + "hit_strand" + this.getHit_strand()
                    + "align_len" + this.getAlign_len()
                    + "gaps" + this.getGaps()
                    + "qseq" + this.getQseq()
                    + "hseq" + this.getHseq()
                    + "midline" +  this.getMidline();
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
