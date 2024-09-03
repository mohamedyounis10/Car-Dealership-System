import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private String color;
    
    public static Scanner input = new Scanner(System.in);

    // Constructor to input car details
    public Car() {
        System.out.println("Please enter the make of the car:");
        this.make = input.nextLine();
        System.out.println("Please enter the model of the car:");
        this.model = input.nextLine();
        System.out.println("Please enter the year of the car:");
        this.year = input.nextInt();
        System.out.println("Please enter the price of the car:");
        this.price = input.nextDouble();
        input.nextLine(); // Clear the buffer
        System.out.println("Please enter the color of the car:");
        this.color = input.nextLine();
    }

    // Parameterized Constructor
    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    // Getter and Setter for Make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter for Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for Year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and Setter for Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for Color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Method to print all car details
    public void printCarInfo() {
        System.out.println("Car Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
        System.out.println("Color: " + this.color);
    }
}

