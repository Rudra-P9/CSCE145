//Name: Rudrakumar Patel

public class Car extends Vehicle {
    
    // Instance variables
    private double gasMileage; // Non-negative number of gallons
    private int numberOfPassengers; // Non-negative number of passengers

    // Default constructor
    public Car() {
        super(); // Call Vehicle's default constructor
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        this.setGasMileage(gasMileage);
        this.setNumberOfPassengers(numberOfPassengers);
    }

    // Accessors
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutators
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            System.out.println("Invalid value for gas mileage!");
            this.gasMileage = 0.0; // Reset to 0.0 if invalid
        }
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            System.out.println("Invalid value for number of passengers!");
            this.numberOfPassengers = 0; // Reset to 0 if invalid
        }
    }

    // Methods
    public boolean equals(Car other) {
        return super.equals(other) &&
               this.gasMileage == other.gasMileage &&
               this.numberOfPassengers == other.numberOfPassengers;
    }

    public String toString() {
        return super.toString() +
               "\nGas Mileage: " + gasMileage + " gallons" +
               "\nNumber of Passengers: " + numberOfPassengers;
    }
}