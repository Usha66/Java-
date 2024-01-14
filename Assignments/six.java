package Assignments;
import java.util.Scanner;
public class six {
	    public static void main(String[] args) {
	        int n, sum = 0;

	        Scanner in = new Scanner(System.in);
	        System.out.print("Input number of terms is: ");
	        n = in.nextInt();
	        System.out.println("The odd numbers are:");

	        for (int i = 1; i <= 2 * n; i += 2) {
	            // Print the odd numbers
	            System.out.print(i + " ");

	            // Accumulate the sum of odd numbers
	            sum += i;
	        }

	        System.out.println("\nThe Sum of odd Natural Numbers up to " + n + " terms is: " + sum);

	        // Close the scanner
	        in.close();
	    }
	}


