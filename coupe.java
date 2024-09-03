public class Coupe extends Car {
    private boolean isConvertible;
    private boolean hasSunroof;

    // Constructor to input Coupe details
    public Coupe() {
        super();  // Call the constructor of the Car class to initialize common attributes
        System.out.println("Is the car convertible? (true/false):");
        this.isConvertible = input.nextBoolean();
        System.out.println("Does the car have a sunroof? (true/false):");
        this.hasSunroof = input.nextBoolean();
        input.nextLine(); // Clear the buffer
    }

    // Parameterized Constructor
    public Coupe(String make, String model, int year, double price, String color, boolean isConvertible, boolean hasSunroof) {
        super(make, model, year, price, color);
        this.isConvertible = isConvertible;
        this.hasSunroof = hasSunroof;
    }

    // Getter and Setter for isConvertible
    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    // Getter and Setter for hasSunroof
    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    // Overridden method to print all Coupe details
    @Override
    public void printCarInfo() {
        super.printCarInfo();  // Call the print method of the Car class to print common details
        System.out.println("Convertible: " + (this.isConvertible ? "Yes" : "No"));
        System.out.println("Sunroof: " + (this.hasSunroof ? "Yes" : "No"));
    }
}
