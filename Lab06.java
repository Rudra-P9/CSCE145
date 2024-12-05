// Name: Rudrakumar Patel

import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {
        
        // Scanner for user input
        Scanner key = new Scanner(System.in);
        
        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int height = key.nextInt();
        
        // Input validation: check if the height is valid
        if (height < 1) {
            System.out.println("Invalid value for height! Exiting the program!");
            System.exit(0);
        }
        
        // Draw the upper half of the triangle
        for (int i = 1; i <= height; i++) {
            // Print asterisks for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Draw the lower half of the triangle
        for (int i = height - 1; i > 0; i--) {
            // Print asterisks for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // End of program message
        System.out.println("End of program!");
    }
}