package flow_of_control;

import java.util.Scanner;

public class switchcase {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the valid option");
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1: System.out.println("The sum of the numbers is:"+(num1+num2));
		break;
		
		case 2: System.out.println("The sub of the numbers is:"+(num1-num2));
		break;
		
		case 3: System.out.println("The mul of the numbers is:"+(num1*num2));
		break;
		
		case 4: System.out.println("The div of the numbers is:"+(num1/num2));
		break;
		
		default: System.out.println("INVALID");
		}
	}
}