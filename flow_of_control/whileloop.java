package flow_of_control;

import java.util.Scanner;

public class whileloop {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int i=0;
		while(i<=10) {
			if((i*a)%2==0)
			System.out.println(a*i);
			else {
			System.out.println("");
		}
			i++;
	}
	}
}


