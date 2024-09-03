public class Hatchback extends Car {
    private boolean hasRearSpoiler;
    private boolean hasFoldableSeats;

    // Constructor to input Hatchback details
    public Hatchback() {
        super();  // Call the constructor of the Car class to initialize common attributes
        System.out.println("Does the Hatchback have a rear spoiler? (true/false):");
        this.hasRearSpoiler = input.nextBoolean();
        System.out.println("Does the Hatchback have foldable seats? (true/false):");
        this.hasFoldableSeats = input.nextBoolean();
        input.nextLine(); // Clear the buffer
    }

    // Parameterized Constructor
    public Hatchback(String make, String model, int year, double price, String color, boolean hasRearSpoiler, boolean hasFoldableSeats) {
        super(make, model, year, price, color);
        this.hasRearSpoiler = hasRearSpoiler;
        this.hasFoldableSeats = hasFoldableSeats;
    }

    // Getter and Setter for hasRearSpoiler
    public boolean isHasRearSpoiler() {
        return hasRearSpoiler;
    }

    public void setHasRearSpoiler(boolean hasRearSpoiler) {
        this.hasRearSpoiler = hasRearSpoiler;
    }

    // Getter and Setter for hasFoldableSeats
    public boolean isHasFoldableSeats() {
        return hasFoldableSeats;
    }

    public void setHasFoldableSeats(boolean hasFoldableSeats) {
        this.hasFoldableSeats = hasFoldableSeats;
    }

    // Overridden method to print all Hatchback details
    @Override
    public void printCarInfo() {
        super.printCarInfo();  // Call the print method of the Car class to print common details
        System.out.println("Type of car Hatchback ");
        System.out.println("Rear Spoiler: " + (this.hasRearSpoiler ? "Yes" : "No"));
        System.out.println("Foldable Seats: " + (this.hasFoldableSeats ? "Yes" : "No"));
    }
}
