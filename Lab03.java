//Name: Rudrakumar Patel

import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {
		
		final double PACKAGE_PRICE = 99.0;
		
		//Scanner for user input
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of software package ordered: ");
		int numOfPackages = key.nextInt();
		
		//Input validation: check if the number of package is valid
		if (numOfPackages < 1)
		{
			System.out.println("Invalid value for package count! Exiting the program!");
			System.exit(0);
		}
		
		//Calculate total before discount
		double totalBeforeDiscount = numOfPackages * PACKAGE_PRICE;
		double discount = 0;
		
		//Discount percentage based on quantity
		if(numOfPackages >= 10 && numOfPackages <= 19)
		{
			discount = 0.20; //20%
		}
		else if(numOfPackages >= 20 && numOfPackages <= 49)
		{
			discount = 0.30; //30%
		}
		else if(numOfPackages >= 50 && numOfPackages <= 99)
		{
			discount = 0.40; //40%
		}
		else if(numOfPackages >= 100)
		{
			discount = 0.50; //50%
		}
		
		//Calculate discount amount and total discount
		double discountAmount = totalBeforeDiscount * discount;
		double totalAfterDiscount = totalBeforeDiscount - discountAmount;
		
		//Output Results
		System.out.println("Total Bill Amount (before discount) = $" + totalBeforeDiscount);
		System.out.println("Amount of discount = $" + discountAmount);
		System.out.println("Total Bill Amount (after discount) = $" +totalAfterDiscount);
	}

}
