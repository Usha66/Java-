package flow_of_control;

import java.util.Scanner;

public class tableof2 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		for(int n=1;n<11;n++)
			if(n%2==0) //inttable=i*table;
			System.out.println(n*i);
			else {
				System.out.println();
			}
		
	}

}
