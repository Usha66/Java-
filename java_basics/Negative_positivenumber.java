package java_basics;

import java.util.Scanner;

public class Negative_positivenumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println((num>0)?"IT'S A POSITIVE NUMBER":"IT'S A NEGATIVE NUMBER");

	}

}
