// Name: Rudrakumar Patel

import java.util.Scanner;

public class AppleTester {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner key = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Apple tester!!!");

        // Create first apple with default constructor
        System.out.println("Creating the first apple!");
        Apple apple1 = new Apple();
        System.out.println("Default values of the first apple object:");
        apple1.writeOutput();

        // Create second apple with user input
        System.out.println("\nEnter the type of the second apple object:");
        String type = key.nextLine();

        // Weight input with validation
        double weight = 0.0;
        while (true) {
            System.out.println("Enter the weight of the second apple object:");
            if (key.hasNextDouble()) {
                weight = key.nextDouble();
                key.nextLine(); // Consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                key.nextLine(); // Consume invalid input
            }
        }

        // Price input with validation
        double price = 0.0;
        while (true) {
            System.out.println("Enter the price of the second apple object:");
            if (key.hasNextDouble()) {
                price = key.nextDouble();
                key.nextLine(); // Consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                key.nextLine(); // Consume invalid input
            }
        }

        // Create second apple
        System.out.println("\nCreating the second apple object!");
        Apple apple2 = new Apple(type, weight, price);
        System.out.println("Values of the second apple object:");
        apple2.writeOutput();

        // Close scanner
        key.close();
    }
}