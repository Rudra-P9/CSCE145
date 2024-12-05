//Rudrakumar Patel

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		
		//A scanner to read user input
		Scanner key = new Scanner(System.in);
		
		//Prompt user to enter the number of books
		System.out.println("How many books did you purchase at BN booksellers this month?");
		int booksPurchased = key.nextInt();
		
		//Validate user input
		if(booksPurchased < 0)
		{
			System.out.println("Invalid value entered! Exiting the program!");
			System.exit(0);
		}
		else
		{
			int pointsEarned;
			
			//switch statement to determine points earned
			switch(booksPurchased)
			{
			case 0:
				pointsEarned = 0;
				System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
				break;
			case 1:
				pointsEarned = 5;
				System.out.println("Congratulations!!! You have earned 5 points!");
				break;
			case 2:
				pointsEarned = 15;
				System.out.println("Congratulations!!! You have earned 15 points!");
				break;
			case 3:
				pointsEarned = 30;
				System.out.println("Congratulations!!! You have earned 30 points!");
				break;
			default:
				pointsEarned = 60;
				System.out.println("Congratulations!!! You have earned 60 points!");
				break;
			}
			if(booksPurchased >= 1)
			{
				System.out.println("You may redeem these points on your next book purchase!");
			}
		}
		key.close();
	
	}

}

