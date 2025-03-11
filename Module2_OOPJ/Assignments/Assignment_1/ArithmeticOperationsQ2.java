/* Q2.2.Write a Java program that takes two integers as input and performs all arithmetic operations on them. */

import java.util.Scanner;

public class ArithmeticOperationsQ2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Performing arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = (num2 != 0) ? (num1 / num2) : 0;  // Avoid division by zero
        int remainder = (num2 != 0) ? (num1 % num2) : 0; // Avoid modulo by zero

        // Displaying results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        
        if (num2 != 0) { // Checking for division by zero
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + remainder);
        } else {
            System.out.println("Division and Modulus not possible (division by zero).");
        }

        // Closing the scanner
        scanner.close();
    }
}

/* Output :

Enter first integer: 45
Enter second integer: 44
Addition: 89
Subtraction: 1
Multiplication: 1980
Division: 1
Modulus: 1

*/