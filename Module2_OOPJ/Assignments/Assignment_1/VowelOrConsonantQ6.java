/* Q6.Develop a program that takes user input for a character and prints whether it is a vowel or consonant  */

import java.util.Scanner;

public class VowelOrConsonantQ6 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for easy comparison

        // Checking if it's a letter
        if (Character.isLetter(ch)) {
            // Checking for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a letter.");
        }

        // Closing scanner
        scanner.close();
    }
}

/* Output :

Enter a character: r
r is a consonant.

Enter a character: A
a is a vowel.

*/