import java.util.Scanner;

public class Person {
    private String fname;
    private String lname;
    private String email;
    private int number;

    public static Scanner input = new Scanner(System.in);

    // Constructor to input person details
    public Person() {
        System.out.println("Please enter your first name:");
        this.fname = input.next();
        System.out.println("Please enter your last name:");
        this.lname = input.next();
        System.out.println("Please enter your email:");
        this.email = input.next();
        System.out.println("Please enter your number:");
        this.number = input.nextInt();
    }

    // Constructor to initialize with given parameters
    public Person(String fname, String lname, String email, int number) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.number = number;
    }

    // Print person details
    public void print() {
        System.out.println("--------------------------");
        System.out.println("Name: " + fname + " " + lname +
                " | Email: " + email +
                " | Number: " + number);
        System.out.println("--------------------------");
    }

    // Edit person's name
    public void editName() {
        System.out.println("Please enter new first name:");
        this.fname = input.next();
        System.out.println("Please enter new last name:");
        this.lname = input.next();
    }

    // Edit person's email
    public void editEmail() {
        System.out.println("Please enter new email:");
        this.email = input.next();
    }

    // Edit person's number
    public void editNumber() {
        System.out.println("Please enter new number:");
        this.number = input.nextInt();
    }
}

