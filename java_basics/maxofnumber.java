package java_basics;
import java.util.Scanner;
public class maxofnumber {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=sc.nextInt();
		System.out.println("Enter the second number");
		int y=sc.nextInt();
		System.out.println("Enter the third number");
		int z=sc.nextInt();
		System.out.println((x>y&x>z)?"X IS MAX NUMBER":y>x&y>z?"Y IS MAX NUMBER":"Z IS MAX NUMBER");


		
	}

}
