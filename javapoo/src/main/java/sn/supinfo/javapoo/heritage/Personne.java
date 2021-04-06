/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.heritage;

import java.util.Objects;

/**
 *
 * @author Nabi Ibrahima
 */
public class Personne {
    private int ID;
    private String prenom;
    private String nom;
    private String adresse;
    private String matricule;
    private String nationalite;
    private String dateNaissance;
    private String lieuNaissance;
    private  String telephone;
    private String email;
    private String genre;
    private String situationMatrimoniale;
    
    public Personne()
    {}

    public Personne(int ID, String prenom, String nom, String adresse, String matricule, String nationalite, String dateNaissance, String lieuNaissance, String telephone, String email, String genre, String situationMatrimoniale) {
        this.ID = ID;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.matricule = matricule;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.telephone = telephone;
        this.email = email;
        this.genre = genre;
        this.situationMatrimoniale = situationMatrimoniale;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSituationMatrimoniale() {
        return situationMatrimoniale;
    }

    public void setSituationMatrimoniale(String situationMatrimoniale) {
        this.situationMatrimoniale = situationMatrimoniale;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.matricule);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (!Objects.equals(this.matricule, other.matricule)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", matricule=" + matricule + ", nationalite=" + nationalite + ", dateNaissance=" + dateNaissance + ", lieuNaissance=" + lieuNaissance + ", telephone=" + telephone + ", email=" + email + ", genre=" + genre + ", situationMatrimoniale=" + situationMatrimoniale + '}';
    }
    
}
