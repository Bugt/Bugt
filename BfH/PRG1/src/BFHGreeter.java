public class BFHGreeter {
	public static final String 	GREETINGS_BASIC = "Hello there ";
	public static final String 	GREETINGS_FORMAL = "Good day sir/madam ";
	
	public static void basicGreet(String name) {
		System.out.println(GREETINGS_BASIC + name);
	}
	public static void formalGreet(String name) {
		System.out.println(GREETINGS_FORMAL + name);
	}
}