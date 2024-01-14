package java_basics;

import java.util.Scanner;

public class Arrayvowel {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		char[]array;
		array=new char[10];
		System.out.println("enter your letter:");
		for (int i=0;i<10;i++) {
			array[i]=sc.next().charAt(0);
		}
		for(int i=0;i<10;i++) {
			if(array[i]=='a'||array[i]=='i'||array[i]=='e'||array[i]=='o'||array[i]=='u') {
				System.out.println(array[i]);
		}
		
		}
	}

}