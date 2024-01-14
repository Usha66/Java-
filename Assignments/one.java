package Assignments;
import java.util.Scanner;
public class one {
	    public static void main(String[] args) {
	        // Taking input from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Checking if the length of the string is even or odd
	        if (inputString.length() % 2 == 0) {
	            // If it's odd, add '0' to make it even
	        	
	            inputString += '0';
	            System.out.println("Modified string (made even): " + inputString);
	        } else {
	            // If it's already even, just print the string
	        	
	            System.out.println("Input string is already even: " + inputString);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


