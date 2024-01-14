package java_basics;
import java.util.Scanner;
public class Simple_interest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		int pa=sc.nextInt();
		System.out.println("Enter Rate:");
		int rate=sc.nextInt();
		System.out.println("Enter Time:");
		int time=sc.nextInt();
		System.out.println("Simple Interest="+(pa*rate*time/100));
		}

	}



