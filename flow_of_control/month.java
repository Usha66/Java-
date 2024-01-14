package flow_of_control;
import java.util.Scanner;
public class month {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month name: ");
		String monthName = scanner.nextLine().toLowerCase();
		int days = getDaysInMonth(monthName);
		if (days != -1) {
			System.out.println("Number of days in " + monthName + ": " + days);
	        } 
		else {
			System.out.println("Invalid month name. Please enter a valid month.");
	        }
		scanner.close();
	    }

	    private static int getDaysInMonth(String month) {
	        switch (month) {
	            case "january":
	            case "march":
	            case "may":
	            case "july":
	            case "august":
	            case "october":
	            case "december":
	                return 31;
	            case "april":
	            case "june":
	            case "september":
	            case "november":
	                return 30;
	            case "february":
	                return 28; // Assuming non-leap year for simplicity
	            default:
	                return -1; // Invalid month
	        }
	    }
	}


