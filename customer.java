import java.util.Scanner;

public class Customer extends Person {
    private String address;
    private String job;

    public static Scanner input = new Scanner(System.in);

    // Default Constructor
    public Customer() {
        super();
        System.out.println("Please enter your address:");
        this.address = input.nextLine();
        System.out.println("Please enter your job:");
        this.job = input.nextLine();
    }

    // Parameterized Constructor
    public Customer(String firstName, String lastName, String email, int phoneNumber, String address, String job) {
        super(firstName, lastName, email, phoneNumber);
        this.address = address;
        this.job = job;
    }

    // Method to print customer details
    @Override
    public void print() {
        super.print();
        System.out.println("Address: " + address + " | Job: " + job);
    }

    // Getter and Setter for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for Job
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
