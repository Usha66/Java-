package flow_of_control;

import java.util.Scanner;

public class calculator {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the valid option");
		int option=sc.nextInt();
		
		if(option==1) {
			System.out.println("The sum of the numbers is:"+(num1+num2));
		}
		else if(option==2) {
			System.out.println("The sub of the numbers is:"+(num1-num2));
		}
		else if(option==3) {
			System.out.println("The mul of the numbers is:"+(num1*num2));
        }
		else if(option==4) {
			System.out.println("The div of the numbers is:"+(num1/num2));
        }
		else {
			System.out.println("INVALID OPTION");
		}
	}
}

//user will enter january , we need to tell number of days as output 
//user should always put the month name