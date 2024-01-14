package java_basics;// USING THIRD VARIABLE
import java.util.Scanner;
public class Swapping_number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		System.out.println("BEFORE SWAPPING: a = " + a + ", b = " + b + ", c = " + c);
		// Swapping logic using a temporary variable
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("AFTER SWAPPING: a = " + a + ", b = " + b + ", c = " + c);

		}
	





 //WITHOUT USING THIRD VARIABLE
    public static void main1(String[] args) {
    	Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
