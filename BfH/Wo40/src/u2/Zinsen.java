package u2;
/**
 * Titel:     Quelltext zu Kapitel 5
 * Buch:      Grundkurs-Java f�r Wirtschaftsinformatiker. Vieweg 2007.
 * Autoren:   Klaus-Georg Deck und Herbert Neuendorf
 * Copyright: Copyright (c) 2007
 *
 * @author Herbert Neuendorf
 * @version 1.1 leicht abgeaendert Roland Aeschbacher
 *
 */
public class Zinsen {
   public static void main( String[] args ){
      final double ZINS = 0.05;   // Konstante zins
      double kapital = 1000.0;

      //ZINS = 0.04; // verboten

      System.out.println( "Startkapital = " + kapital );
      kapital = kapital * (1 + ZINS);
      System.out.println( "Nach einem Jahr = " + kapital );
      kapital = kapital * (1 + ZINS);
      System.out.println( "Nach zwei Jahren = " + kapital );
      kapital = kapital * (1 + ZINS);
      System.out.println( "Nach drei Jahren = " + kapital );
   }
}

