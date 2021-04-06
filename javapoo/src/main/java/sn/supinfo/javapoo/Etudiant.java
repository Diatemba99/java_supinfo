package sn.supinfo.javapoo;

import sn.supinfo.javapoo.Etudiant;

public class Etudiant extends Personne {
    private String matricule;
    

    public Etudiant(String prenom,String nom,String tel,String mail,int age,String matricule) {
        super(prenom,nom,tel,mail,age);
        this.matricule=matricule;
    }

   
    
}