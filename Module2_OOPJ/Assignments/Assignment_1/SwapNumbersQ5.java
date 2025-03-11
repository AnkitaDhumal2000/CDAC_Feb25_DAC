/* Q5. Write a Java program to swap two numbers using a temporary variable and without using a temporary variable. */


import java.util.Scanner;

public class SwapNumbersQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Swapping using a temporary variable
        System.out.println("\nBefore Swapping (Using Temp Variable): num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2);

        // Resetting values
        System.out.print("\nEnter first number again: ");
        num1 = scanner.nextInt();
        
        System.out.print("Enter second number again: ");
        num2 = scanner.nextInt();

        // Swapping without using a temporary variable (Using Arithmetic Operations)
        System.out.println("\nBefore Swapping (Without Temp Variable): num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2; // Step 1: num1 becomes sum of both numbers
        num2 = num1 - num2; // Step 2: num2 gets original num1
        num1 = num1 - num2; // Step 3: num1 gets original num2
        System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}

/* Output :

Enter first number: 22
Enter second number: 11

Before Swapping (Using Temp Variable): num1 = 22, num2 = 11
After Swapping: num1 = 11, num2 = 22

Enter first number again: 22
Enter second number again: 11

Before Swapping (Without Temp Variable): num1 = 22, num2 = 11
After Swapping: num1 = 11, num2 = 22

*/