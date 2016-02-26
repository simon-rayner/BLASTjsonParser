/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.uio.medisin.bag.utilities.blastjsonparser;

/**
 *
 * @author simonray
 * 
 */
public class BLASTHitDescription {
    private String     id              =  "";
    private String     accession       =  "";
    private String     title           =  "";
    private int        taxid           =  0;
    private String     sciname         =  "";

    
    
    
    /**
     * Stringify the instance
     * 
     * @return 
     */
    @Override
    public String toString(){
        return
                "id:\t" + this.getId() + "\n"
                + "accession:\t" + this.getAccession() + "\n"
                + "title    :\t" + this.getTitle() + "\n"
                + "taxID    :\t" + this.getTaxid() + "\n"
                + "sciName  :\t" + this.getSciname();
    }
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
