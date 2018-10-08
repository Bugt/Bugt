package u2;
/**
 * Titel:     Quelltext zu Kapitel 5
 * Buch:      Grundkurs-Java f�r Wirtschaftsinformatiker. Vieweg 2007.
 * Autoren:   Klaus-Georg Deck und Herbert Neuendorf
 * Copyright: Copyright (c) 2007
 *
 * @author Herbert Neuendorf
 * @version 1.0
 *
 */
public class Wahrheit {
   public static void main( String[] args ){
      boolean p,q;
      int x = 10, y = 20;

      p = true;
      q = x < y;               // Vergleich liefert true

      if( y > x )
         p = false;   // Zuweisung des Wertes false
      System.out.println( "\nq = " + q + " und p = " + p + "\n");
   }
}



