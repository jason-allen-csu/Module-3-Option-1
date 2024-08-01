import java.util.Scanner;

public class AveWithholding {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double weeklyIncome;
		double taxRate = 0.0;
		double weeklyWithholding = 0.0;
		
		// User input for weekly salary
		System.out.print("Enter your weekly income: ");
        weeklyIncome = scnr.nextDouble();
        
        // Tax rate calculation
        if (weeklyIncome < 500) {
        	taxRate = 0.1;
        } else if (weeklyIncome < 1500) {
        	taxRate = 0.15;
        } else if (weeklyIncome < 2500) {
        	taxRate = 0.20;
        } else {
        	taxRate = 0.3;
        }
        
        // Tax Withholding
        weeklyWithholding = taxRate * weeklyIncome;
        
        // Output Display
        System.out.println("Weekly Income: $" + weeklyIncome);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Weekly Tax Withholding: $" + weeklyWithholding);
	}
}