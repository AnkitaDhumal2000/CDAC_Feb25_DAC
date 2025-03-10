/*11. Write a program to check if a number is positive and even using logical operators (&&, ||, !). */




public class LogicalDemo5{
    public static void main(String[] args) {
        boolean a = true, b = false;
        
        // Demonstrating logical operators
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a && b: " + (a && b)); // Logical AND
        System.out.println("a || b: " + (a || b)); // Logical OR
        System.out.println("!a: " + (!a)); // Logical NOT
        System.out.println("!b: " + (!b)); // Logical NOT
    }
}


/*
import java.util.Scanner;

 public class LogicalDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Checking if the number is positive and even using logical operators
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else if (num > 0) {
            System.out.println(num + " is positive but not even.");
        } else {
            System.out.println(num + " is not positive.");
        }
        
        scanner.close();
    }
}
*/