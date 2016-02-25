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
public class Search {
    private final String                                query_id             =  "";
    private final String                                query_title          =  "";
    private final int                                   query_len         =  0;
    private final String                                num                  =  "";
    private final ArrayList<Hit>                        hits;
    private final Stat                                  stat;
    
    public Search(){
        hits = new ArrayList<>();
        stat = new Stat();
    }

    /**
     * @return the query_id
     */
    public String getQuery_id() {
        return query_id;
    }

    /**
     * @return the query_title
     */
    public String getQuery_title() {
        return query_title;
    }

    /**
     * @return the query_length
     */
    public int getQuery_len() {
        return query_len;
    }

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @return the hits
     */
    public ArrayList<Hit> getHits() {
        return hits;
    }

    /**
     * @return the stat
     */
    public Stat getStat() {
        return stat;
    }
}


