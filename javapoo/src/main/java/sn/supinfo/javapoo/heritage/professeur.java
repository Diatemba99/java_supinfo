/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.heritage;

/**
 *
 * @author Nabi Ibrahima
 */
public class professeur extends Personne{
    private String specialite ; 
    public professeur(){}
    
    public professeur (int ID,String prenom,String nom,
            String adresse,String matricule,
            String nationalite,String dateNaissance,
            String lieuNaissance,String telephone,
            String email,String genre,
            String situationMatrimoniale, String groupeSanguin
    ){
        
        super(ID, prenom,nom,adresse,matricule,nationalite,dateNaissance,lieuNaissance, telephone,
            email,genre, situationMatrimoniale);
        this.specialite = specialite ;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "specialite=" + specialite ;
    }
    
}


