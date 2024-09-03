public class Sports extends Car {
    private boolean hasTurbo;
    private int topSpeed;

    // Constructor to input Sports details
    public Sports() {
        super();  // Call the constructor of the Car class to initialize common attributes
        System.out.println("Does the Sports car have a turbo? (true/false):");
        this.hasTurbo = input.nextBoolean();
        System.out.println("Enter the top speed of the Sports car (in km/h):");
        this.topSpeed = input.nextInt();
        input.nextLine(); // Clear the buffer
    }

    // Parameterized Constructor
    public Sports(String make, String model, int year, double price, String color, boolean hasTurbo, int topSpeed) {
        super(make, model, year, price, color);
        this.hasTurbo = hasTurbo;
        this.topSpeed = topSpeed;
    }

    // Getter and Setter for hasTurbo
    public boolean isHasTurbo() {
        return hasTurbo;
    }

    public void setHasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    // Getter and Setter for topSpeed
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Overridden method to print all Sports details
    @Override
    public void printCarInfo() {
        super.printCarInfo();  // Call the print method of the Car class to print common details
        System.out.println("Type of car aports ");
        System.out.println("Turbo: " + (this.hasTurbo ? "Yes" : "No"));
        System.out.println("Top Speed: " + this.topSpeed + " km/h");
    }
}

