import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("Which operation would you like to perform?");
		System.out.println("A: Dollars per hour to dollars per year.");
		System.out.println("B: Dollars per year to dollars per hour.");
		
		
		Scanner s = new Scanner(System.in);
		String choice = s.next(); // user input

		if (choice.equals("A")) {
			hoursToYears();
		}
		
		else if (choice.equals("B")) {
			yearsToHours();
		}
		
		else {System.out.println("User choice must be either A or B.");}
		
		System.exit(0);
		
	}
	
	public static void hoursToYears() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter how much you make an hour.");
		int dollarsAnHour = s.nextInt();
		
		System.out.println("Please enter how many hours you work a week.");
		int hoursAWeek = s.nextInt();
		
		int dollarsAYear = dollarsAnHour * hoursAWeek * 52;
		System.out.println("You make " + dollarsAYear + " dollars a year.");
		
	}
	
	public static void yearsToHours() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter how much you make a year.");
		int dollarsAYear = s.nextInt();
		
		System.out.println("Please enter how many hours you work a week.");
		int hoursAWeek = s.nextInt();
		
		int dollarsAnHour = dollarsAYear / 52;
		dollarsAnHour /= hoursAWeek;
		
		System.out.println("You make " + dollarsAnHour + " dollars an hour.");
		
	}

}
