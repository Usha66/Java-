package Assignments;
import java.util.Scanner;
public class five {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Input value
		System.out.print("Input value: ");
	    double input = in.nextDouble();
	    // Write your logic here to complete the code
	    if (input == 0) {
	    	System.out.println("zero");
	    	        } 
	    else if (input > 0) {
	    	System.out.print("positive ");
	    	if (input < 1) {
	    		System.out.println("small");
	    	            }
	    	else if (input > 1000000) {
	    		System.out.println("large");
	    	            }
	    	        }
	    else {
	    	System.out.print("negative ");
	    	if (input > -1) {
	    		System.out.println("small");
	    	            } 
	    	else if (input < -1000000) {
	    		System.out.println("large");
	    	            }
	    	        }
	    // Close the scanner
	    in.close();
	    	    }
	    	}
