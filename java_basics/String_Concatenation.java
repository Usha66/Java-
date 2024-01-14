package java_basics;
import java.util.Scanner;
public class String_Concatenation {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstString");
		String a=sc.next().concat(null);
		System.out.println("Enter the secondString");
		String b=sc.next().concat(null);
		System.out.printf("CONCANTENATED STRING=+", a+b);

		
		
	}

}
