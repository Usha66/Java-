package Assignments;
import java.util.Scanner;
public class three {
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);

		        // Input first string
		        System.out.print("Input First String: ");
		        String A = in.next();

		        // Input second string
		        System.out.print("Input Second String: ");
		        String B = in.next();

		        // 1. Sum the lengths of A and B
		        int totalLength = A.length() + B.length();
		        System.out.println("Sum of lengths: " + totalLength);

		        // 2. Determine if A is lexicographically larger than B
		        String comparisonResult = (A.compareTo(B) > 0) ? "Yes" : "No";
		        System.out.println("Is A lexicographically larger than B? " + comparisonResult);

		        // 3. Capitalize the first letter in A and B and print them on a single line
		        String capitalizedA = capitalizeFirstLetter(A);
		        String capitalizedB = capitalizeFirstLetter(B);
		        System.out.println("Capitalized Strings: " + capitalizedA + " " + capitalizedB);

		        // Close the scanner
		        in.close();
		    }

		    // Function to capitalize the first letter of a string
		    private static String capitalizeFirstLetter(String input) {
		        return input.substring(0, 1).toUpperCase() + input.substring(1);
		    }
		}
