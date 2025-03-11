/* 7.Create a Java program to check whether a given number is even or odd using command-line arguments */

public class EvenOrOddQ7{
    public static void main(String[] args) {
        // Check if command-line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java EvenOrOdd <number>");
            return;
        }

        try {
            // Convert command-line argument to an integer
            int num = Integer.parseInt(args[0]);

            // Check if the number is even or odd
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
