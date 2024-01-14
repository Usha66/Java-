package Assignments;
import java.util.Scanner;
public class seven {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Input first number: ");
	        int x = in.nextInt();
	        System.out.print("Input second number: ");
	        int y = in.nextInt();
	        System.out.print("Input third number: ");
	        int z = in.nextInt();

	        // Write your logic here to complete the code
	        if (x < y && y < z) {
	            System.out.println("Increasing");
	        } else if (x > y && y > z) {
	            System.out.println("Decreasing");
	        } else {
	            System.out.println("Neither increasing nor decreasing order");
	        }

	        // Close the scanner
	        in.close();
	    }
	}

