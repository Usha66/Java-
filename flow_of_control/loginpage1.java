package flow_of_control;
import java.util.Scanner;
public class loginpage1 {
		public static void main(String[]args)
		{
			Scanner sc= new Scanner(System.in);
			String user="usha";
			String pswd="ki12";
			System.out.println("Enter your UserName :");
			String username=sc.nextLine();
			
			if(username.equalsIgnoreCase(user)) 
				 {
					System.out.println("Enter your Password :");
					String password=sc.nextLine();
					if(password.equalsIgnoreCase(pswd)) {
						System.out.println("correct password");
						System.out.println("You are Logged In");
					}
				}
				
			
			else {
				System.out.println("Invalid username");
			}
			
		}

	}