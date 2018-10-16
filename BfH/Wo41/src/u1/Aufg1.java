package u1;

import java.util.Scanner;

public class Aufg1 {
	public static void main(String[] args) {
		// open scanner
		Scanner inp = new Scanner(System.in);
		System.out.print("\nCircle calculation ");
		System.out.print("\n==================");
		System.out.print("\nPlease enter the radius of the circle");

		if (inp.hasNextFloat() == true) {
			double inputRadius = inp.nextFloat();
			double area = inputRadius * inputRadius * Math.PI;
			double circumference = 2 * Math.PI * inputRadius;
			// Print the number with 2 decimal places.
			System.out.printf("The area is: %5.2f \n", area);
			System.out.printf("The Circumference is: %7.2e \n", circumference);
		} else {
			String str = inp.nextLine();
			System.out.println(str + " is not a possible number!");
		}
	}
}
