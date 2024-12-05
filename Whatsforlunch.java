import java.util.Scanner;

public class Whatsforlunch {

	public static void main(String[] args) {
		
		//print a message on the console
		
		//single-line comment
		
		/*
		 * Multi-line
		 * comment
		 */
		
		//print a message on the console
		System.out.println("Welcome to my first Java Program!");
		
		/*
		 * Escape Characters
		 *    \n - new line
		 *    \" - double line
		 */
		
		System.out.print("\"JAVA\" is fun!\n");
		
		//creates a Scanner object
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What\'s for lunch today? \nEnter entree:");
		
		String entree;    //declare a variable
		
		entree = key.nextLine();
		
		// + concatenation(join) operator
		// = assignment operator
		
		System.out.println("Enter side and drink:");
		
		String side = key.next();
		key.nextLine();  //reads the remainder of the current line
		
		String drink = key.nextLine();
		
		System.out.println("Entree: " + entree);
		
		System.out.println("Side: "+side);
		
		System.out.println("Drink: "+drink);
		
		
		
	}


}