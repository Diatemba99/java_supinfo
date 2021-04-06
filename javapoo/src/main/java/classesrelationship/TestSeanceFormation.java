package classesrelationship;

public class TestSeanceFormation {
    private static Object salleFormation;

    public static void  main(string [] args)
    {
        Module module1 = new  Module();
        module1.setId(1);
        module1.setNom("JAVA POO");
        module1.setVolumeHoraire(20);
        module1.setcoef(1);


        SalleFormation salleFormation1 = new SalleFormatiion();
        salleFormation1.setId(1);
        salleFormation1.setNom("Blue-Ray");
        salleFormation1.capicite(30);

        SeanceFormation seanceFormation1 = new SeanceFormation();
        seanceFormation1.setDate("06/04/2021");
        seanceFormation1.setHeureDebut("15h");
        seanceFormation1.setHeureFin("17h");
        seanceFormation1.setSalleFormation(salleFormation);

        //====================================================
        SalleFormation salleFormation2 = new SalleFormatiion();
        salleFormation2.setId(1);
        salleFormation2.setNom("Blue-Ray");
        salleFormation2.capicite(30);

        SeanceFormation seanceFormation2 = new SeanceFormation();
        seanceFormation2.setDate("15/04/2021");
        seanceFormation2.setHeureDebut("15h");
        seanceFormation2.setHeureFin("17h");
        seanceFormation2.setSalleFormation(salleFormation);

        //====================================================
        SalleFormation salleFormation3 = new SalleFormatiion();
        salleFormation3.setId(1);
        salleFormation3.setNom("Blue-Ray");
        salleFormation3.capicite(30);

        SeanceFormation seanceFormation3 = new SeanceFormation();
        seanceFormation3.setDate("18/05/2021");
        seanceFormation3.setHeureDebut("16h");
        seanceFormation3.setHeureFin("18h");
        seanceFormation3.setSalleFormation(salleFormation);

        //Ajout des séances de formation à une date
        SeanceFormation [] tabSeances = new SeanceFormation[5];
        tabSeances[0] = seanceFormation1;
        tabSeances[1] = seanceFormation2;
        tabSeances[2] = seanceFormation3;


        salleFormation1.setSeanceFormation(tabSeances);
        //Affichage des elements
        System.out.println("Les Salles de Formations:");
        System.out.println(salleFormation1);
        System.out.println("Les seances de Formations");
        for (SeanceFormation seance: tabSeances)
        {
            System.out.println(seance);
        }
}



