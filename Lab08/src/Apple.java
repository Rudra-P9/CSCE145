// Name: Rudrakumar Patel

public class Apple {
    // Instance variables
    private String type;
    private double weight;
    private double price;
    
    // Default constructor
    public Apple() {
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }
    
    // Parameterized constructor
    public Apple(String xType, double xWeight, double xPrice) {
        this.setType(xType);
        this.setWeight(xWeight);
        this.setPrice(xPrice);
    }
    
    // Accessors
    public String getType() {
        return this.type;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    // Mutators
    public void setType(String xType) {
        if (xType.equals("Red Delicious")
            || xType.equals("Golden Delicious")
            || xType.equals("Gala")
            || xType.equals("Granny Smith")) {
            this.type = xType;
        } else {
            System.out.println("Invalid value for type!");
            this.type = null;
        }
    }
    
    public void setWeight(double xWeight) {
        if (xWeight > 0 && xWeight <= 2) {
            this.weight = xWeight;
        } else {
            System.out.println("Invalid value for weight!");
            this.weight = 0.0;
        }
    }
    
    public void setPrice(double xPrice) {
        if (xPrice >= 0) {
            this.price = xPrice;
        } else {
            System.out.println("Invalid value for price!");
            this.price = 0.0;
        }
    }
    
    // Output method
    public void writeOutput() {
        System.out.println("Type: " + (this.type == null ? "null" : this.type));
        System.out.println("Weight: " + this.weight + " kg");
        System.out.printf("Price: $%.2f\n", this.price);
    }
}