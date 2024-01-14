package java_basics;

import java.util.Scanner;

public class vowel_consonant {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letter");
		char l=sc.next().charAt(0);
		System.out.println((l=='a'|l=='e'|l=='i'|l=='o'|l=='u')?"IT'S A VOWEL":"IT'S A CONSONANT");
	}
}


		
	
