package u2;
/**
 * Titel:     Quelltext zu Kapitel 5
 * Buch:      Grundkurs-Java f�r Wirtschaftsinformatiker. Vieweg 2007.
 * Autoren:   Klaus-Georg Deck und Herbert Neuendorf
 * Copyright: Copyright (c) 2007
 *
 * @author Herbert Neuendorf
 * @version 1.1
 *
 */
public class Typregeln {
   public static void main( String[] args ) {
      byte b1 = 55;
      byte b2 = 10;
      byte b3;

//      b3 = b1 + b2;
      //Fehler: byte + byte gibt int, passt nicht in byte b3!
      b3 = (byte)(b1 + b2);
      System.out.println( "Wert b3 = " + b3 );
      //Fehler: short + short gibt int, passt nicht in short s3!
      short s1 = 100;
      short s2 = 200;
      short s3;

      s3 = (short)(s1 + s2);
      System.out.println( "Wert s3 = " + s3 );
   }
}






