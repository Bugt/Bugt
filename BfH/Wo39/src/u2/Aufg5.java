package u2;

public class Aufg5 {
	public static void main (String[] args) {
		byte zahl = 127;
		
		// Overflow als int
		zahl = (byte)(zahl + 10);
		System.out.println("Byte-Addition: " + zahl + "\n");
	}
}
