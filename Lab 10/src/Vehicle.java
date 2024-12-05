//Name: Rudrakumar Patel

public class Vehicle {
    
    // Instance variables
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 1; // Default to 1 cylinder
        this.ownerName = "No owner";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        this.setManufacturerName(manufacturerName);
        this.setNumberOfCylinders(numberOfCylinders);
        this.setOwnerName(ownerName);
    }

    // Accessors
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Mutators
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            System.out.println("Invalid value for number of cylinders!");
            this.numberOfCylinders = 1; // Reset to 1 if invalid
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Methods
    public boolean equals(Vehicle other) {
        return this.manufacturerName.equals(other.manufacturerName) &&
               this.numberOfCylinders == other.numberOfCylinders &&
               this.ownerName.equals(other.ownerName);
    }

    public String toString() {
        return "Manufacturer's Name: " + manufacturerName +
               "\nNumber Of Cylinders: " + numberOfCylinders +
               "\nOwner's Name: " + ownerName;
    }
}