// Define a class for LightBulb
class LightBulb {
    private boolean isOn;

    // Constructor to initialize the light bulb
    public LightBulb() {
        this.isOn = false;
    }

    // Method to switch on the light bulb
    public void switchOn() {
        this.isOn = true;
        System.out.println("Light bulb is switched on.");
    }

    // Method to switch off the light bulb
    public void switchOff() {
        this.isOn = false;
        System.out.println("Light bulb is switched off.");
    }

    // Method to check if the light bulb is on
    public void checkIfOn() {
        if (this.isOn) {
            System.out.println("Light bulb is on.");
        } else {
            System.out.println("Light bulb is off.");
        }
    }
}

// Define a class for Car
class Car {
    private double litersOfGas;
    private double totalKmRun;
    private double efficiency;

    // Constructor to initialize the car
    public Car(double litersOfGas, double totalKmRun, double efficiency) {
        this.litersOfGas = litersOfGas;
        this.totalKmRun = totalKmRun;
        this.efficiency = efficiency;
    }

    // Method to drive the car
    public void drive(double km) {
        this.totalKmRun += km;
        this.litersOfGas -= km / this.efficiency;
        System.out.println("Car has been driven for " + km + " km.");
    }

    // Method to increase efficiency
    public void increaseEfficiency(double newEfficiency) {
        this.efficiency = newEfficiency;
        System.out.println("Car's efficiency has been increased to " + newEfficiency + " km/liter.");
    }

    // Method to change efficiency
    public void changeEfficiency(double newEfficiency) {
        this.efficiency = newEfficiency;
        System.out.println("Car's efficiency has been changed to " + newEfficiency + " km/liter.");
    }

    // Method to check gas
    public void checkGas() {
        System.out.println("Car has " + this.litersOfGas + " liters of gas.");
    }

    // Method to check odometer reading
    public void checkOdometerReading() {
        System.out.println("Car's odometer reading is " + this.totalKmRun + " km.");
    }
}

// Define a class for BankAccount
class BankAccount {
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " into the bank account.");
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + " from the bank account.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Bank account balance is " + this.balance);
    }
}

// Main class to test the above classes
public class Main {
    public static void main(String[] args) {
        // Create instances of LightBulb, Car, and BankAccount
        LightBulb lightBulb = new LightBulb();
        Car car = new Car(50, 0, 10);
        BankAccount bankAccount = new BankAccount(1000);

        // Test the methods of LightBulb
        lightBulb.switchOn();
        lightBulb.checkIfOn();
        lightBulb.switchOff();
        lightBulb.checkIfOn();

        // Test the methods of Car
        car.drive(100);
        car.increaseEfficiency(15);
        car.changeEfficiency(12);
        car.checkGas();
        car.checkOdometerReading();

        // Test the methods of BankAccount
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        bankAccount.checkBalance();
    }
}
