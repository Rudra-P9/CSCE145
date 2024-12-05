import java.util.Scanner;
public class EndangeredSpeciesOne {

		public String name;
		public int population;
		public double growthRate;
	
		//method - prompts
		public void readInput()
		{
			Scanner key = new Scanner(System.in);
			
			System.out.println("Enter the name of the species:");
			
			name = key.nextLine();
			
			System.out.println("What is it's population:");
			
			population = key.nextInt();
			
			System.out.println("What is its growth rate?");
			
			growthRate = key.nextDouble();
			
		}
		
		//method definition
		public void writeOutput()
		{
			System.out.println("Species: "+name+"\nPopulation: "+population+"\nGrowthRate: "+growthRate+"%");
		
		}
		
		//method with a return type - int
		public int getPopulationIn10()
		{
			int count = 10;
			
			double populationAmount = population;
			
			int result = 0;
			
			while(count > 0 && populationAmount >= 0)
			{
				populationAmount += populationAmount* (growthRate / 100);
				
				count--;
			}
			
			if(populationAmount > 0)
			{
				result = (int) populationAmount;
				
			}
			return result;
			
			
		}
}
