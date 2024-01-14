package java_basics;

import java.util.Scanner;

public class Input_taking {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);//system.in gives standard inputs //scanner is a class for taking inputs
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println((age>=18)?"You are eligible to vote":"You are not eligible to vote");
	
	}

}
