package flow_of_control;

import java.util.Scanner;

public class Login {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String user="usha";
		String pswd="ki12";
		System.out.println("Enter your username");
		String username=sc.nextLine();
		
		System.out.println("Enter the password");
		String password=sc.nextLine();
		
		if(username.equalsIgnoreCase(user)) {
			if(password.equalsIgnoreCase(pswd)) {
				System.out.println("You are logged in");
			}
			else {
				System.out.println("INVALID PASSWORD");
			}
		}
		else {
			System.out.println("INVALID CREDENTIALS");
		}
	}

}
