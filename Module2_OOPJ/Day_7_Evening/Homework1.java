// Interface 1: Printer
interface Printer {
    void print(); // Abstract method for printing
}

// Interface 2: Scanner
interface Scanner {
    void scan(); // Abstract method for scanning
}

// Interface 3: Computer (Extends Printer)
interface Computer extends Printer {
    void compute(); // Abstract method for computing
}

// Interface 4: Laptop (Extends Scanner)
interface Laptop extends Scanner {
    void portable(); // Abstract method for portability
}

// Driver class implementing both Computer and Laptop (Multiple Inheritance)
public class Homework1 implements Computer, Laptop {
    
    // Implementing print() from Printer (via Computer)
    public void print() {
        System.out.println("Printing a document...");
    }

    // Implementing scan() from Scanner (via Laptop)
    public void scan() {
        System.out.println("Scanning a document...");
    }

    // Implementing compute() from Computer
    public void compute() {
        System.out.println("Performing computer calculations...");
    }

    // Implementing portable() from Laptop
    public void portable() {
        System.out.println("Laptop is portable and easy to carry.");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an object of Test class
        Homework1 obj = new Homework1();

        // Calling all implemented methods
        obj.print();    // From Printer (via Computer)
        obj.scan();     // From Scanner (via Laptop)
        obj.compute();  // From Computer
        obj.portable(); // From Laptop
    }
}
