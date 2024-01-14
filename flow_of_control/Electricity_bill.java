package flow_of_control;
import java.util.Scanner;

public class Electricity_bill {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of units consumed: ");
	        int unitsConsumed = scanner.nextInt();

	        double totalBill = calculateElectricityBill(unitsConsumed);

	        System.out.println("Electricity Bill: Rs. " + totalBill);

	        scanner.close();
	    }

	    public static double calculateElectricityBill(int unitsConsumed) {
	        double totalBill = 0;

	        if (unitsConsumed <= 100) {
	            totalBill = unitsConsumed * 1.20;
	        } else if (unitsConsumed <= 300) {
	            totalBill = (100 * 1.20) + ((unitsConsumed - 100) * 2.00);
	        } else {
	            totalBill = (100 * 1.20) + (200 * 2.00) + ((unitsConsumed - 300) * 2.50);
	        }

	        return totalBill;
	    }
	}


