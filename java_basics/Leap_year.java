package java_basics;
import java.util.Scanner;
public class Leap_year {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
	int year=sc.nextInt();
	System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)?"IT'S A LEAP YEAR":"IT'S NOT A LEAP YEAR");

}
}
