import java.util.ArrayList;
import java.util.Scanner;

public class CarDealershipSystem {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int ch;     // Choice for main menu
        int ch2;    // Choice for budget menu
        int ch3;    // Choice for admin operations
        int ch4;    // Choice for adding car types
        int ch5;    // Choice for editing or printing cars
        String ipass;  // Input password for verification
        int s;      // Number of cars to add
        int number_car; // Number of the car to edit
        int selectedCar; // Selected car index

        // Creating admin objects
        ArrayList<Admin> adminList = new ArrayList<>();
        adminList.add(new Admin("yousef", "hamed", "hamed123456@example.edu", 1123551527, 22210421,"password1", 2539.80, 200.9, 400.8 ));
        adminList.add(new Admin("admin2", "last2", "admin2@example.com", 1123551528, 22210422, "password2",2600.00, 210.0, 410.0 ));
        adminList.add(new Admin("admin3", "last3", "admin3@example.com", 1123551529, 22210423, "password3",2700.00, 220.0, 420.0 ));

        // Creating a list to store car objects
        ArrayList<Car> carList = new ArrayList<>();
        
        // Adding test data to the car list
        carList.add(new Coupe("Toyota", "Supra", 2022, 250000, "Red", true, true));
        carList.add(new Coupe("BMW", "Z4", 2023, 280000, "Blue", false, true));
        carList.add(new SUV("Honda", "CR-V", 2021, 320000, "Black", true, 7));
        carList.add(new SUV("Ford", "Explorer", 2022, 350000, "White", false, 7));
        carList.add(new Sports("Ferrari", "488", 2022, 450000, "Yellow", true, 350));
        carList.add(new Sports("Lamborghini", "Huracan", 2023, 490000, "Green", false, 355));
        carList.add(new Hatchback("Ford", "Fiesta", 2021, 200000, "Grey", true, true));
        carList.add(new Hatchback("Volkswagen", "Golf", 2023, 230000, "Green", false, true));
        
        System.out.println("       Welcome!  ");
        System.out.println(" Car Dealership System ");

        // Main loop for the menu
        do {
            System.out.println(" ----------------------");
            System.out.println("press 1 Admin  ");
            System.out.println("press 2 Customer ");
            System.out.println("please enter choice  ");
            System.out.print("My Choice : ");
            ch = input.nextInt();
            System.out.println("------------------------");
            
            switch (ch) {
                case 1:
                    // Admin password verification
                    System.out.print("please enter your password : ");
                    ipass = input.next();
                    boolean adminFound = false;
                    for (Admin admin : adminList) {
                        if (admin.getPassword().equals(ipass)) {
                            adminFound = true;
                            // Admin operations menu
                            do {
                                System.out.println(" ----------------------");
                                System.out.println("press 1 to add car  ");
                                System.out.println("press 2 to edit specific car ");
                                System.out.println("press 3 to print cars");
                                System.out.println("press 0 to exit ");
                                System.out.print("My Choice : ");
                                ch3 = input.nextInt();
                                System.out.println("------------------------");
                                switch (ch3) {
                                    case 1:
                                        // Adding cars
                                        do {
                                            System.out.println(" ----------------------");
                                            System.out.println("press 1 to add coupe  ");
                                            System.out.println("press 2 to add SUV ");
                                            System.out.println("press 3 to add sports");
                                            System.out.println("press 4 to add hatchback ");
                                            System.out.println("press 0 to exit ");
                                            System.out.print("My Choice : ");
                                            ch4 = input.nextInt();
                                            System.out.println("------------------------");
                                            switch (ch4) {
                                                case 1:
                                                    // Add coupes
                                                    System.out.println("please enter how many coupes do you want to enter?");
                                                    s = input.nextInt();
                                                    for (int i = 0; i < s; i++) {
                                                        System.out.println("Car " + (i + 1));
                                                        Car a = new Coupe(); // Assumes a default constructor is available
                                                        carList.add(a);
                                                    }
                                                    break;
                                                case 2:
                                                    // Add SUVs
                                                    System.out.println("please enter how many SUVs do you want to enter?");
                                                    s = input.nextInt();
                                                    for (int i = 0; i < s; i++) {
                                                        System.out.println("Car " + (i + 1));
                                                        Car a = new SUV(); // Assumes a default constructor is available
                                                        carList.add(a);
                                                    }
                                                    break;
                                                case 3:
                                                    // Add sports cars
                                                    System.out.println("please enter how many sports cars do you want to enter?");
                                                    s = input.nextInt();
                                                    for (int i = 0; i < s; i++) {
                                                        System.out.println("Car " + (i + 1));
                                                        Car a = new Sports(); // Assumes a default constructor is available
                                                        carList.add(a);
                                                    }
                                                    break;
                                                case 4:
                                                    // Add hatchbacks
                                                    System.out.println("please enter how many hatchbacks do you want to enter?");
                                                    s = input.nextInt();
                                                    for (int i = 0; i < s; i++) {
                                                        System.out.println("Car " + (i + 1));
                                                        Car a = new Hatchback(); // Assumes a default constructor is available
                                                        carList.add(a);
                                                    }
                                                    break;
                                                case 0:
                                                    break;
                                            }
                                        } while (ch4 != 0);
                                        break;
                                    case 2:
                                        // Editing car information
                                        do {
                                            System.out.println("All Cars : ");
                                            printAllCars(carList);
                                            
                                            System.out.print("Enter the number of the car you want to edit: ");
                                            number_car = input.nextInt();
                                            
                                            System.out.println(" ----------------------");
                                            System.out.println("press 1 to edit model  ");
                                            System.out.println("press 2 to edit price");
                                            System.out.println("press 3 to edit color");
                                            System.out.println("press 0 to exit ");
                                            System.out.print("My Choice : ");
                                            ch5 = input.nextInt();
                                            System.out.println("------------------------");
                                            switch (ch5) {
                                                case 1:
                                                    System.out.print("Enter new model of car: ");
                                                    String new_model = input.next();
                                                    carList.get(number_car - 1).setModel(new_model);
                                                    break;
                                                case 2:
                                                    System.out.print("Enter new price of car: ");
                                                    double new_price = input.nextDouble();
                                                    carList.get(number_car - 1).setPrice(new_price);
                                                    break;
                                                case 3:
                                                    System.out.print("Enter new color of car: ");
                                                    String new_color = input.next();
                                                    carList.get(number_car - 1).setColor(new_color);
                                                    break;
                                            }             
                                        } while (ch5 != 0);
                                        break;
                                    case 3:
                                        // Printing cars
                                        System.out.println(" ----------------------");
                                        System.out.println("press 1 to print all cars");
                                        System.out.println("press 2 to print Coupe cars");
                                        System.out.println("press 3 to print SUV cars");
                                        System.out.println("press 4 to print Sports cars");
                                        System.out.println("press 5 to print Hatchback cars");
                                        System.out.println("press 0 to exit");
                                        System.out.print("My Choice: ");
                                        ch5 = input.nextInt();
                                        System.out.println("------------------------");
                                        switch (ch5) {
                                            case 1:
                                                printAllCars(carList);
                                                break;
                                            case 2:
                                                printCarsByType(carList, Coupe.class);
                                                break;
                                            case 3:
                                                printCarsByType(carList, SUV.class);
                                                break;
                                            case 4:
                                                printCarsByType(carList, Sports.class);
                                                break;
                                            case 5:
                                                printCarsByType(carList, Hatchback.class);
                                                break;
                                            case 0:
                                                break;
                                        }
                                        break;
                                    case 0:
                                        break;
                                }
                            } while (ch3 != 0);
                        }
                    }
                    if (!adminFound) {
                        System.out.println("Invalid password. Try again later.");
                    }
                    break;

                case 2:
                    // Customer budget selection
                    System.out.println("Please select your Budget");
                    System.out.println("1. Low budget (from 200000 to 300000)");
                    System.out.println("2. Middle budget (from 300000 to 400000)");
                    System.out.println("3. High budget (from 400000 to 500000)");
                    System.out.print("Your choice: ");
                    ch2 = input.nextInt();
                    ArrayList<Car> filteredCars;
                    switch (ch2) {
                        case 1:
                            filteredCars = filterCarsByBudget(carList, 200000, 300000);
                            break;
                        case 2:
                            filteredCars = filterCarsByBudget(carList, 300000, 400000);
                            break;
                        case 3:
                            filteredCars = filterCarsByBudget(carList, 400000, 500000);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            continue;
                    }
                    
                    if (filteredCars.isEmpty()) {
                        System.out.println("No cars available in this budget range.");
                    } else {
                        printAllCars(filteredCars);
                        System.out.print("Enter the number of the car you want to purchase: ");
                        selectedCar = input.nextInt();
                        
                        if (selectedCar > 0 && selectedCar <= filteredCars.size()) {
                            Car chosenCar = filteredCars.get(selectedCar - 1);
                            printReceipt(chosenCar);
                        } else {
                            System.out.println("Invalid car number.");
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (ch != 0);
    }

    // Method to filter cars by budget
    public static ArrayList<Car> filterCarsByBudget(ArrayList<Car> carList, double minPrice, double maxPrice) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car c : carList) {
            if (c.getPrice() >= minPrice && c.getPrice() <= maxPrice) {
                result.add(c);
            }
        }
        return result;
    }

    // Method to print a receipt
    public static void printReceipt(Car car) {
        System.out.println("------ Receipt ------");
        car.printCarInfo();
        System.out.println("Thank you for your purchase!");
        System.out.println("----------------------");
    }

    // Method to print all cars in the list
    public static void printAllCars(ArrayList<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("Car " + (i + 1));
            carList.get(i).printCarInfo(); // Assuming each car has a method to print its info
            System.out.println("---------------");
        }
    }

    // Method to print cars by their type (e.g., Coupe, SUV, etc.)
    public static void printCarsByType(ArrayList<Car> carList, Class<? extends Car> type) {
        boolean found = false;
        for (Car c : carList) {
            if (type.isInstance(c)) {
                c.printCarInfo();
                System.out.println("---------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars of this type available.");
        }
    }
}
