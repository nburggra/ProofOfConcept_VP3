/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.util.*;
/**
 *
 * @author NickB
 */
public class Bestelling {
   
    private ArrayList<Gerecht> lijst;

    public Bestelling() {
        lijst = new ArrayList<Gerecht>();
    }

    public void voegtoe(Gerecht gerecht1) {
        lijst.add(gerecht1);
    }

    public double berekenTotaal() {
        double totaal = 0;

        for (Gerecht a : lijst) {
            totaal = totaal + a.getPrijs();
        }
        return totaal;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();

        for (Gerecht gerecht1 : lijst) {
            buffer.append(gerecht1);
            buffer.append("\n");
        }
        buffer.append("Totaalbedrag: ");
        buffer.append(this.berekenTotaal());
        return buffer.toString();
    }

}
