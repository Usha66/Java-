package flow_of_control;

import java.util.Scanner;

public class If_else01 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		//even or odd
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		if (num%2==0) {
			System.out.println("Even number");	
		}
		else {
			System.out.println("Odd number");
		}
		//leap year
		int year=sc.nextInt();
		System.out.println("Enter Year To Be Checked:");
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("IT'S A LEAP YEAR");
		}
		else {
		System.out.println("IT'S NOT A LEAP YEAR");
		}
	}

}

