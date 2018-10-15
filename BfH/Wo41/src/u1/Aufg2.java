package u1;

import java.util.Scanner;

public class Aufg2 {
	public static void main(String[] args) {
		// open scanner
		Scanner inp = new Scanner(System.in);
		System.out.print("\nLeapyear calculation ");
		System.out.print("\n====================");
		System.out.print("\nPlease a year (for ex. 2004)");

		if (inp.hasNextInt()) {
			int inputYear = inp.nextInt();

			boolean isLeap;
			// check if it is a leapyear
			if (inputYear % 4 == 0) {
				isLeap = true;
				// check if / 100
				if (inputYear % 100 == 0) {
					// check if / 400
					if (inputYear % 400 != 0) {
						isLeap = false;
					}
				}
			} else {
				isLeap = false;
			}

			if (isLeap) {
				System.out.println("The year " + inputYear + " is a leapyear.");
			} else {
				System.out.println("The year " + inputYear + " is not a leapyear.");
			}
		} else {
			String str = inp.nextLine();
			System.out.println(str + " is not a possible year!");
		}
	}
}
