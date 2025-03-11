/* Q#. Implement a Java program to demonstrate implicit and explict type casting. */

public class TypeCastingDemoQ3 {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // Automatically converts int to double

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double originalDouble = 99.99;
        int narrowedInt = (int) originalDouble; // Manually casting double to int (loses decimal part)

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + originalDouble);
        System.out.println("Converted to integer: " + narrowedInt);

        // Additional Example: Casting char to int
        char charValue = 'A'; // ASCII value of 'A' is 65
        int asciiValue = charValue; // Implicit casting from char to int

        System.out.println("\nImplicit Casting of char to int:");
        System.out.println("Character value: " + charValue);
        System.out.println("Converted to ASCII int: " + asciiValue);

        // Explicit Casting: Converting int to char
        int numericValue = 66;
        char convertedChar = (char) numericValue; // Explicit casting from int to char

        System.out.println("\nExplicit Casting of int to char:");
        System.out.println("Integer value: " + numericValue);
        System.out.println("Converted to character: " + convertedChar);
    }
}

/* Output : 

Implicit Type Casting:
Integer value: 100
Converted to double: 100.0

Explicit Type Casting:
Double value: 99.99
Converted to integer: 99

Implicit Casting of char to int:
Character value: A
Converted to ASCII int: 65

Explicit Casting of int to char:
Integer value: 66
Converted to character: B

*/
