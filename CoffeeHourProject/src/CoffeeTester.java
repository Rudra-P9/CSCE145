import java.util.Scanner;

public class CoffeeTester {
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        
        do
        {
            Coffee coffee1 = new Coffee();
            Coffee coffee2 = new Coffee();
            
            System.out.println("Welcome to the Coffee Hour!!!");
            
            //Input for first coffee
            System.out.println("What's the name of the first coffee?");
            coffee1.setName(keyboard.nextLine());
            
            System.out.println("What's the caffeine content?");
            coffee1.setCaffeineContent(keyboard.nextInt());
            keyboard.nextLine(); // Consume newline
            
            //Print first coffee details
            System.out.println(coffee1.toString());
            System.out.printf("It would take %.1f cups of %s before it's dangerous to drink more.\n", 
                              coffee1.riskyAmount(), coffee1.getName());
            
            //Input for second coffee
            System.out.println("What's the name of the second coffee?");
            coffee2.setName(keyboard.nextLine());
            
            System.out.println("What's the caffeine content?");
            coffee2.setCaffeineContent(keyboard.nextInt());
            keyboard.nextLine(); // Consume newline
            
            //Print second coffee details
            System.out.println(coffee2.toString());
            System.out.printf("It would take %.1f cups of %s before it's dangerous to drink more.\n", 
                              coffee2.riskyAmount(), coffee2.getName());
            
            //Compare coffees
            System.out.println("Are both coffee's the same? " + coffee1.equals(coffee2));
            
            //Ask to continue
            System.out.println("Do you want to create more coffee objects? Enter \"Yes\" or \"No\":");
            userInput = keyboard.nextLine();
            
        } while(userInput.equalsIgnoreCase("Yes"));
        
        keyboard.close();
    }
}