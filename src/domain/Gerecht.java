/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author NickB
 */
public class Gerecht {

    private String Gerechtnaam;
    private double Gerechtprijs;

    public Gerecht(
            String Gerechtnaam,
            double Gerechtprijs) {
        
        this.Gerechtnaam = Gerechtnaam;
        this.Gerechtprijs = Gerechtprijs;
    }
    
      public String getGerechtnaam() {
      return Gerechtnaam;
  }


    public String toString() {
        return "Gerechtnaam" + Gerechtnaam + ", " +
               "Gerechtprijs" + Gerechtprijs + " euro";
              
    }
    
     public double getPrijs() {
    return Gerechtprijs;
    }

}
