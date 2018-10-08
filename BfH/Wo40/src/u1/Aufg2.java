package u1;

public class Aufg2 {
	public static void main(String[] args) {
		double grösse = 1.75;
		double gewicht = 69.0;
		double bmiAsDouble = gewicht / (grösse * grösse);
		int bmi = (int) bmiAsDouble; // casted!
		int bmiRounded = (int) Math.round(bmiAsDouble);
		String status = "";
		
		// check BMI
		if(bmi < 18.5) {
			status = "untergewichtig und sollten zunehmen. (\"roter Bereich\")";
		}else if(bmi > 18.5 && bmi <= 25) {
			status = "normalgewichtig und sollten Ihr Gewicht halten. (\"grüner Bereich\")";
		}else if(bmi > 25 && bmi < 30) {
			status = "übergewichtig und sollten Ihr Gewicht reduzieren. (\"oranger Bereich\")";
		}else if(bmi >= 30) {
			status = "fettleibig und sollten Ihr Gewicht umgehend reduzieren. (\"roter Bereich\")";
		}
		System.out.println("Ihr BMI ist: " + bmiAsDouble + " gerundet: " +bmiRounded+ ". Sie sind: " + status);
	}
}
