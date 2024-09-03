public class SUV extends Car {
    private boolean has4WD;
    private int seatingCapacity;

    // Constructor to input SUV details
    public SUV() {
        super();  // Call the constructor of the Car class to initialize common attributes
        System.out.println("Does the SUV have 4WD? (true/false):");
        this.has4WD = input.nextBoolean();
        System.out.println("Enter the seating capacity of the SUV:");
        this.seatingCapacity = input.nextInt();
        input.nextLine(); // Clear the buffer
    }

    // Parameterized Constructor
    public SUV(String make, String model, int year, double price, String color, boolean has4WD, int seatingCapacity) {
        super(make, model, year, price, color);
        this.has4WD = has4WD;
        this.seatingCapacity = seatingCapacity;
    }

    // Getter and Setter for has4WD
    public boolean isHas4WD() {
        return has4WD;
    }

    public void setHas4WD(boolean has4WD) {
        this.has4WD = has4WD;
    }

    // Getter and Setter for seatingCapacity
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    // Overridden method to print all SUV details
    @Override
    public void printCarInfo() {
        super.printCarInfo();  // Call the print method of the Car class to print common details
        System.out.println("Type of car SUV ");
        System.out.println("4WD: " + (this.has4WD ? "Yes" : "No"));
        System.out.println("Seating Capacity: " + this.seatingCapacity);
    }
}
