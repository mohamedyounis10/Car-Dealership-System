import java.util.Scanner;

public class Admin extends Person {
    private int id;
    private String pass;
    private double salary;
    private double bouns;
    private double deduc;

    public static Scanner input = new Scanner(System.in);

    // Default Constructor
    public Admin() {
        super();
        System.out.println("Please enter your ID:");
        this.id = input.nextInt();
        System.out.println("Please enter your password:");
        this.pass = input.next();
        System.out.println("Please enter your salary:");
        this.salary = input.nextDouble();
        System.out.println("Please enter your bonus:");
        this.bouns = input.nextDouble();
        System.out.println("Please enter your deduction:");
        this.deduc = input.nextDouble();
    }

    // Parameterized Constructor
    public Admin(String firstName, String lastName, String email, int phoneNumber, int id, String pass,double salary, double bouns, double deduc) {
        super(firstName, lastName, email, phoneNumber);
        this.id = id;
        this.pass=pass;
        this.salary = salary;
        this.bouns = bouns;
        this.deduc = deduc;
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }
    
      // Getter and Setter for Password
    public String getPassword() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter for Bonus
    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    // Getter and Setter for Deduction
    public double getDeduc() {
        return deduc;
    }

    public void setDeduc(double deduc) {
        this.deduc = deduc;
    }

    // Method to print admin details
    @Override
    public void print() {
        super.print();
        System.out.println("ID: " + id + " | Salary: " + salary + " | Bonus: " + bouns + " | Deduction: " + deduc);
    }
}
