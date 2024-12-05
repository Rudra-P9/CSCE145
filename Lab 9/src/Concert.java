//Name: Rudrakumar Patel

public class Concert {
	
    // Instance variables
    private String bandName;
    private int capacity;
    private int numTicketsSoldByPhone;
    private int numTicketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // Default constructor
    public Concert() {
        this.bandName = "No name yet";
        this.capacity = 100; // Default capacity
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // Parameterized constructor
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
        this.setBandName(bandName);
        this.setCapacity(capacity);
        this.setPriceByPhone(priceByPhone);
        this.setPriceAtVenue(priceAtVenue);
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
    }

    // Parameterized constructor with all attributes
    public Concert(String bandName, int capacity, int numTicketsSoldByPhone, int numTicketsSoldAtVenue, double priceByPhone, double priceAtVenue) {
        this.setBandName(bandName);
        this.setCapacity(capacity);
        this.setNumTicketsSoldByPhone(numTicketsSoldByPhone);
        this.setNumTicketsSoldAtVenue(numTicketsSoldAtVenue);
        this.setPriceByPhone(priceByPhone);
        this.setPriceAtVenue(priceAtVenue);
    }

    // Accessors
    public String getBandName() {
        return bandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumTicketsSoldByPhone() {
        return numTicketsSoldByPhone;
    }

    public int getNumTicketsSoldAtVenue() {
        return numTicketsSoldAtVenue;
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    // Mutators
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Invalid value for capacity!");
            this.capacity = 0; // Reset to 0 if invalid
        }
    }

    public void setNumTicketsSoldByPhone(int numTicketsSoldByPhone) {
        if (numTicketsSoldByPhone >= 0) {
            this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        } else {
            System.out.println("Invalid value for tickets sold by phone!");
            this.numTicketsSoldByPhone = 0; // Reset to 0 if invalid
        }
    }

    public void setNumTicketsSoldAtVenue(int numTicketsSoldAtVenue) {
        if (numTicketsSoldAtVenue >= 0) {
            this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        } else {
            System.out.println("Invalid value for tickets sold at venue!");
            this.numTicketsSoldAtVenue = 0; // Reset to 0 if invalid
        }
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        } else {
            System.out.println("Invalid value for price by phone!");
            this.priceByPhone = 0.0; // Reset to 0.0 if invalid
        }
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        } else {
            System.out.println("Invalid value for price at venue!");
            this.priceAtVenue = 0.0; // Reset to 0.0 if invalid
        }
    }

    // Methods
    public int totalNumberOfTicketsSold() {
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
    }

    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    public void buyTicketsAtVenue(int tickets) {
        if (tickets > 0 && ticketsRemaining() >= tickets) {
            numTicketsSoldAtVenue += tickets;
        } else {
            System.out.println("Not enough tickets remaining or invalid number!");
        }
    }

    public void buyTicketsByPhone(int tickets) {
        if (tickets > 0 && ticketsRemaining() >= tickets) {
            numTicketsSoldByPhone += tickets;
        } else {
            System.out.println("Not enough tickets remaining or invalid number!");
        }
    }

    public double totalSales() {
        return (numTicketsSoldAtVenue * priceAtVenue) + (numTicketsSoldByPhone * priceByPhone);
    }
}