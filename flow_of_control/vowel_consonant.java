package flow_of_control;
import java.util.Scanner;

public class vowel_consonant {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char inputChar = scanner.next().toLowerCase().charAt(0);

	        if (Character.isLetter(inputChar)) {
	            boolean isVowel = (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u');
	            if (isVowel) {
	                System.out.println(inputChar + " is a vowel.");
	            } else {
	                System.out.println(inputChar + " is a consonant.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a valid alphabetic character.");
	        }

	        scanner.close();
	    }
	}

