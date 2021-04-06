package sn.supinfo.javapoo;

import sn.supinfo.javapoo.Personne;

public class Personne {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private int age;
    public static int nombreObjetCree = 0 ;
    private final String PAYS = "Sénégal";
    private final double TAUX_TVA =18.5;    

    public Personne() {
        Personne.nombreObjetCree++ ;
    }

    public Personne(String prenom,String nom,String tel,String mail,int age) {
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.mail=mail;
        this.age=age;
        Personne.nombreObjetCree++ ;
    }

    public Personne(String prenom,String nom){
    this.prenom=prenom;
    this.nom=nom;
    Personne.nombreObjetCree++ ;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public static int getNombreObjetCree(){
    return Personne.nombreObjetCree++ ;
}
public String getPays (){
    return this.PAYS;
}
public double getTauxTva(){
    return this.TAUX_TVA ;
}
    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", tel='" + getTel() + "'" +
            ", mail='" + getMail() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    void setAdresse(String castor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelephone(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void affiche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// on peut appeler le constructeur dans un autre constructeur. on commence par classer les constructeurs par ordre de moins de param a plus de param
} 
