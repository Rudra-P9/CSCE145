// Full Name: Rudra Patel

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of dollars
        System.out.print("How many dollars would you like to spend on chocolate from the vending machine? ");
        int dollars = scanner.nextInt();

        // If the input value is negative, show an error and exit
        if (dollars < 0) {
            System.out.println("Invalid value for amount! Exiting the program!");
            return;
        }

        int chocolateBars = dollars; // Start by buying as many bars as dollars
        int coupons = dollars; // Initially, each chocolate bar gives 1 coupon

        // Redeem coupons while we have 6 or more coupons
        while (coupons >= 6) {
            int extraBars = coupons / 6;
            chocolateBars += extraBars;
            coupons = coupons % 6 + extraBars;
        }

        // Output the result
        System.out.println("You can buy " + chocolateBars + " chocolate bars and will have " + coupons + " coupons left!");
    }
}
