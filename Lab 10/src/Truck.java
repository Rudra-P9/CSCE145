//Name: Rudrakumar Patel

public class Truck extends Vehicle {
    
    // Instance variables
    private double loadCapacity; // Non-negative number of tons
    private double towingCapacity; // Non-negative number of tons

    // Default constructor
    public Truck() {
        super(); // Call Vehicle's default constructor
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        this.setLoadCapacity(loadCapacity);
        this.setTowingCapacity(towingCapacity);
    }

    // Accessors
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutators
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        } else {
            System.out.println("Invalid value for load capacity!");
            this.loadCapacity = 0.0; // Reset to 0.0 if invalid
        }
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0) {
            this.towingCapacity = towingCapacity;
        } else {
            System.out.println("Invalid value for towing capacity!");
            this.towingCapacity = 0.0; // Reset to 0.0 if invalid
        }
    }

    // Methods
    public boolean equals(Truck other) {
        return super.equals(other) &&
               this.loadCapacity == other.loadCapacity &&
               this.towingCapacity == other.towingCapacity;
    }

    public String toString() {
        return super.toString() +
               "\nLoad Capacity: " + loadCapacity +
               "\nTowing Capacity: " + towingCapacity;
    }
}