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
    
    private final int        num              =  1;
    private final double     bitScore         =  38.1576;
    private final int        score            = 19;
    private final double     evalue           = 2.43839;
    private final int        identity         = 19;
    private final int        query_from       = 1;
    private final int        query_to         = 19;
    private final String     query_strand     = "Plus";
    private final int        hit_from         = 1533733;
    private final int        hit_to           = 1533751;
    private final String     hit_strand       = "Plus";
    private final int        align_len        = 19;
    private final int        gaps             = 0;
    private final String     qseq             = "GTTGGGCGGATTAGTCGCA";
    private final String     hseq             = "GTTGGGCGGATTAGTCGCA";
    private final String     midline          = "|||||||||||||||||||";

    
    
    
    
    
    
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @return the bitScore
     */
    public double getBitScore() {
        return bitScore;
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
