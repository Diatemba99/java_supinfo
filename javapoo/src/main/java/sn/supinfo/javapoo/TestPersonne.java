/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo;

/**
 *
 * @author Nabi Ibrahima
 */
public class TestPersonne {
    public static void main (String args[])
    {
        Personne p1 = new Personne ();
        p1.setPrenom("amy");
        p1.setNom("ndiaye");
        p1.setAge(25);
        p1.setAdresse("castor");
        p1.setTelephone("785692145");
        
        
        System.out.println(p1);
        System.out.println(Personne.getNombreObjetCree());
    }
}
