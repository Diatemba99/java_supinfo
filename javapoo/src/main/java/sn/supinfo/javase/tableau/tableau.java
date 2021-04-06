/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javase.tableau;

/**
 *
 * @author Nabi Ibrahima
 */
public class tableau {
    // creation de tableau 
    public static void main(String[]args){
        
    
    int []  tabint= new int[10];
    tabint[0]=25;
    tabint[1]=30;
    tabint[2]=0;
    tabint[3]= -1;
    tabint[4]= 5;
    tabint[5]= 10;
    tabint[6]= 80;
    tabint[7]= 15 ;
    tabint[8]= 17 ;
    tabint[9]= 65;
    String [] tabPays = {"Senegal","Mali"};

    //ajout d element au tableau
    tabint[7]=100;
    tabint[8]=-25;
    tabint[9]=300;
   /* tabPays[2]= "Republik de guinee";
    tabPays[3]= " guinee bissau";
    tabPays[4]= "cap vert";*/
    //afficher un element
    System.out.println(tabint[5]);
    System.out.println(tabPays[1]);
    System.out.println(tabint[7]);
    System.out.println(tabint[8]);
    System.out.println(tabint[9]);
        
    //affichage de tous les elements d un tableau avecla boucle for
    for (int i =0;i<tabint.length;i++)
    {
        System.out.println(tabint[1]);
    }
    // deuxieme forme de la boucle for
    for (int i: tabint)
    {
        System.out.println(i);
    }
    }
}
