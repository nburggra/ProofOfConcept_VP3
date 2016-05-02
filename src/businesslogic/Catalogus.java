/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;
import domain.Gerecht;
import java.util.*;

/**
 *
 * @author NickB
 */
public class Catalogus {
  private ArrayList<Gerecht> lijst;

  public Catalogus() {
    lijst = new ArrayList<Gerecht>();
  }

  public void voegtoe( Gerecht gerecht1 ) {
    lijst.add( gerecht1 );
  }

  public Gerecht zoek( String Gerechtnaam ) {
  Gerecht gezochteGerecht = null;

  for( Gerecht a : lijst ) {
    if( a.getGerechtnaam() == Gerechtnaam )
        gezochteGerecht = a;
  }

  return gezochteGerecht;
}

};