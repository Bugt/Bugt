import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		// define default
		Boolean boolFormality = false;
		System.out.println("Whould you like to be greeted formaly? y/n");
		Boolean formal = getFormality();
		System.out.println("What's your name?");
		String name = getName();
		if(formal) {
			BFHGreeter.formalGreet(name);
		}else {
			BFHGreeter.basicGreet(name);
		}
	}

	private static Boolean getFormality() {
		// define default
		boolean boolFormality = false;
		Scanner scanner = new Scanner(System.in);
	    String formality = scanner.next();
		if(formality.equals("y")) {
	    	boolFormality  = true;
	    }else {
	    	boolFormality = false;
	    }
	    return boolFormality;
	}

	private static String getName() {
		Scanner scanner = new Scanner(System.in);
	    return scanner.next();
	}
}