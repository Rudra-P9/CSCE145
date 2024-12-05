
public class Coffee {
    
    //instance variables
    private String name;
    private int caffeineContent;
    
    //default constructor
    public Coffee()
    {
        this.name = "none";
        this.caffeineContent = 50;
    }
    
    //accessors
    public String getName()
    {
        return this.name;
    }
    
    public int getCaffeineContent()
    {
        return this.caffeineContent;
    }
    
    //mutators
    public void setName(String xName)
    {
        if(xName != null)
        {
            this.name = xName;
        }
    }
    
    public void setCaffeineContent(int xCaffeineContent)
    {
        if(xCaffeineContent >= 50 && xCaffeineContent <= 300)
        {
            this.caffeineContent = xCaffeineContent;
        }
        else
        {
            System.out.println("Invalid caffeine content! Must be between 50 and 300 mg.");
        }
    }
    
    //other methods
    public double riskyAmount()
    {
        return 180.0 / ((this.caffeineContent / 100.0) * 6.0);
    }
    
    public boolean equals(Coffee other)
    {
        return this.name.equals(other.getName()) && 
               this.caffeineContent == other.getCaffeineContent();
    }
    
    public String toString()
    {
        return "Name: " + this.name + 
               "\nCaffeine Amount: " + this.caffeineContent;
    }
}