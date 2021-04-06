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
public class TestPersonne {
    public static void main (String [] args){
        Personne p = new Personne ();
        p.setID(1);
        p.setPrenom("alpha");
        p.setNom ("sy");
        p.setAdresse("dakar");
        p.setDateNaissance("19/12/1998");
        p.setEmail("nabidiallo50@gmail.com");
        p.setGenre("masculin");
        p.setLieuNaissance("guediawaye");
        p.setMatricule("sn16183647");
        p.setNationalite("gueineen");
        p.setSituationMatrimoniale("celibataire");
        p.setTelephone("784262416");
        
        Etudiant etudiant = new Etudiant ( 1 , "habib", "ngurmohamedov","medina","sidk5101",
        "senegalais", "19/03/97", "tenguedj", "772547896", "martinbasse@x.com",
        "masculin " , "marié","O+");
        professeur prof = new professeur (2 , "ba" , "tobad" , "sandaga" , "sidk3252",
        "marocain" , "26/02/1975", "kounoune" , "702589631" , "batobad@yahoo.fr", 
        "masculin" , "celib", "mathematicien");
    }
}
