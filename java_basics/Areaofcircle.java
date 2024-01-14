package java_basics;
import java.util.Scanner;
public class Areaofcircle {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius OF THE CIRCLE:");
		int radius=sc.nextInt();
		double pi=Math.PI;
		System.out.println("AREA OF THE CIRCLE="+(pi*radius*radius));
		}

	}