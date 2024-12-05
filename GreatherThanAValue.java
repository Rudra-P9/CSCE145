import java.util.Scanner;

public class GreatherThanAValue {

	public static final int VALUE = 1000;

	public static void main(String[] args) {

		// package - a library of classes that have been pre-defined
		// eg: Scanner

		// creating a Scanner object
		Scanner key = new Scanner(System.in);

		// asks the user for an input value
		System.out.println("Enter an integer:");

		int number = key.nextInt();

		if (number > VALUE) {
			// if-block
			System.out.println("The number entered is greater than 1000!");

		} else {
			// else-block
			System.out.println("The number entered is not greater than 1000!");
		}

	}

}
