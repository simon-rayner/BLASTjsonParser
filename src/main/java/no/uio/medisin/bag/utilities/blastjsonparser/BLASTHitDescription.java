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
public class Description {
    private final String     id              =  "";
    private final String     accession       =  "";
    private final String     title           =  "";
    private final int        taxid           =  0;
    private final String     sciname         =  "";

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the accession
     */
    public String getAccession() {
        return accession;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the taxid
     */
    public int getTaxid() {
        return taxid;
    }

    /**
     * @return the sciname
     */
    public String getSciname() {
        return sciname;
    }
    
}
