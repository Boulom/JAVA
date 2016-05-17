/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

/**
 *
 * @author boulom
 */
public class PersonneStructure {
    private int idPersonneStructure;
    private int numeroLicence;
    private String nomPersonne;
    private String prenomPersonne;
    private String qualitePersonne;
    private int telPersonne;

    public PersonneStructure(int idPersonneStructure, int numeroLicence, String nomPersonne, String prenomPersonne, String qualitePersonne, int telPersonne) {
        this.idPersonneStructure = idPersonneStructure;
        this.numeroLicence = numeroLicence;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
        this.qualitePersonne = qualitePersonne;
        this.telPersonne = telPersonne;
    }
    
    public void modifier(int numeroLicence, String nomPersonne, String prenomPersonne, String qualitePersonne, int telPersonne) {
        this.numeroLicence = numeroLicence;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
        this.qualitePersonne = qualitePersonne;
        this.telPersonne = telPersonne;
    }

    //Getters
    
    public int getIdPersonneStructure() {
        return idPersonneStructure;
    }

    public int getNumeroLicence() {
        return numeroLicence;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public String getQualitePersonne() {
        return qualitePersonne;
    }

    public int getTelPersonne() {
        return telPersonne;
    }
    
    //Setters

    public void setIdPersonneStructure(int idPersonneStructure) {
        this.idPersonneStructure = idPersonneStructure;
    }

    public void setNumeroLicence(int numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }

    public void setQualitePersonne(String qualitePersonne) {
        this.qualitePersonne = qualitePersonne;
    }

    public void setTelPersonne(int telPersonne) {
        this.telPersonne = telPersonne;
    }

    @Override
    public String toString() {
        return "PersonneStructure{" + "idPersonneStructure=" + idPersonneStructure + ", numeroLicence=" + numeroLicence + ", nomPersonne=" + nomPersonne + ", prenomPersonne=" + prenomPersonne + ", qualitePersonne=" + qualitePersonne + ", telPersonne=" + telPersonne + '}';
    }
    
    
    
    
}
