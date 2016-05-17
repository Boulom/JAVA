/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

import java.io.Serializable;

/**
 *
 * @author boulom
 */

public class Structure  implements Serializable {
    private int idStructure;
    private String codeNafOuApe;
    private int numeroSiret;
    private String raisonSociale;
    private String adresseRue;
    private String adresseVille;
    private int codePostal;
    private String mail;
    private int telephone;
    private PersonneStructure leContact;
    private PersonneStructure leResponsable;

    public Structure(int idStructure, String codeNafOuApe, int numeroSiret, String raisonSociale, String adresseRue, String adresseVille, int codePostal, String mail, int telephone, PersonneStructure leContact, PersonneStructure leResponsable) {
        this.idStructure = idStructure;
        this.codeNafOuApe = codeNafOuApe;
        this.numeroSiret = numeroSiret;
        this.raisonSociale = raisonSociale;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
        this.mail = mail;
        this.telephone = telephone;
        this.leContact = leContact;
        this.leResponsable = leResponsable;
    }

    public Structure(int i, String text, String text0, String text1, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void modifier(String codeNafOuApe, int numeroSiret, String raisonSociale, String adresseRue, String adresseVille, int codePostal, String mail, int telephone) {
        this.codeNafOuApe = codeNafOuApe;
        this.numeroSiret = numeroSiret;
        this.raisonSociale = raisonSociale;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
        this.mail = mail;
        this.telephone = telephone;
        
    }
    
    public void modifier(int i, String text, int parseInt, String text0, String text1, String text2, int parseInt0, String text3, int parseInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //Getters

    public int getIdStructure() {
        return idStructure;
    }

    public String getCodeNafOuApe() {
        return codeNafOuApe;
    }

    public int getNumeroSiret() {
        return numeroSiret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public String getAdresseRue() {
        return adresseRue;
    }

    public String getAdresseVille() {
        return adresseVille;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getMail() {
        return mail;
    }

    public int getTelephone() {
        return telephone;
    }

    public PersonneStructure getLeContact() {
        return leContact;
    }

    public PersonneStructure getLeResponsable() {
        return leResponsable;
    }
    
    //Setters

    public void setIdStructure(int idStructure) {
        this.idStructure = idStructure;
    }

    public void setCodeNafOuApe(String codeNafOuApe) {
        this.codeNafOuApe = codeNafOuApe;
    }

    public void setNumeroSiret(int numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public void setAdresseRue(String adresseRue) {
        this.adresseRue = adresseRue;
    }

    public void setAdresseVille(String adresseVille) {
        this.adresseVille = adresseVille;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setLeContact(PersonneStructure leContact) {
        this.leContact = leContact;
    }

    public void setLeResponsable(PersonneStructure leResponsable) {
        this.leResponsable = leResponsable;
    }

    @Override
    public String toString() {
        return "Structure{" + "idStructure=" + idStructure + ", codeNafOuApe=" + codeNafOuApe + ", numeroSiret=" + numeroSiret + ", raisonSociale=" + raisonSociale + ", adresseRue=" + adresseRue + ", adresseVille=" + adresseVille + ", codePostal=" + codePostal + ", mail=" + mail + ", telephone=" + telephone + ", leContact=" + leContact + ", leResponsable=" + leResponsable + '}';
    }

    

    
    
    
    
}
