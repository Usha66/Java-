package flow_of_control;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int b = scan2.nextInt();
        if(a > b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        }
        else {
            System.out.println("The sum of a and b is: " + (a+b));
        }
    }
}
	//task1 = take 1 input from the user  
	//Take other 2 inputs
    // check if num 1 > num2 -  SWAP THE VALUES 
	// if a!>b then print sum of these 2 numbers}
