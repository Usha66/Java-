package flow_of_control;

import java.util.Scanner;

public class largestofthreenum {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=sc.nextInt();
		
		System.out.println("Enter the second number");
		int y=sc.nextInt();
		
		System.out.println("Enter the third number");
		int z=sc.nextInt();
		
		if(x>y) {
			if(x>z);
			System.out.println("X IS MAX");
		}
		else if(y>x) {
			if(y>z);
			System.out.println("Y IS MAX NUMBER");
		}
		else {
			System.out.println("Z IS MAX NUMBER");
		}
	}
}

