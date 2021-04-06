/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesrelationship;

/**
 *
 * @author Nabi Ibrahima
 */
public class seanceFormation {
    private String date ;
    private String heureDebut ;
    private String heureFin ;
    private salleFormation salleFormation;

    seanceFormation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "seanceFormation{" + "date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", salleFormation=" + salleFormation + '}';
    }

    public seanceFormation(String date, String heureDebut, String heureFin, salleFormation salleFormation) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salleFormation = salleFormation;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the heureDebut
     */
    public String getHeureDebut() {
        return heureDebut;
    }

    /**
     * @param heureDebut the heureDebut to set
     */
    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    /**
     * @return the heureFin
     */
    public String getHeureFin() {
        return heureFin;
    }

    /**
     * @param heureFin the heureFin to set
     */
    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    /**
     * @return the salleFormation
     */
    public salleFormation getSalleFormation() {
        return salleFormation;
    }

    /**
     * @param salleFormation the salleFormation to set
     */
    public void setSalleFormation(salleFormation salleFormation) {
        this.salleFormation = salleFormation;
    }
   
}
