import java.util.Scanner;

public class OutdoorExercise {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the outside temperature(in Fahrenheit): ");
		
		int temperature = key.nextInt();
		
		if(temperature < -144 || temperature > 134)
		{
			System.out.println("Invalid temperature entered for planet Earth!");
			
			System.exit(0);
		}
		else if(temperature >= 40 && temperature < 71)
		{
			System.out.println("Temperature is too cold!");
		}
		else if(temperature >= 71 && temperature < 77)
		{
			System.out.println("Tempeature is ideal for outdoor exercise");
		}
		else if(temperature >= 90 && temperature < 111)
		{
			System.out.println("Temperature is too hot!");
		}
		else
		{
			System.out.println("Temperature unsuitable for outdoor exercise!");
		}
		
		
		
		
		
		/*
		 * 40-70
		 * 71-76
		 * 90-110
		 */

	}

}
