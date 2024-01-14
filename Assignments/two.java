package Assignments;
import java.util.Scanner;
public class two {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        // Input a number
	        System.out.print("Input a number: ");
	        int n = in.nextInt();
	        
	        // Print the first 10 multiples of the input number
	        for (int i = 1; i <= 10; i++) {
	            int result = n * i;
	            System.out.printf("%d x %d = %d%n", n, i, result);
	        }

	        // Close the scanner
	        in.close();
	    }
	}



