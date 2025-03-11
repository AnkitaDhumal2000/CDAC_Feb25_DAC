/*Q4.Create a Java program that converts a given integer to a double and vice versa using wrapper classes. */

public class WrapperConversionQ4 {
    public static void main(String[] args) {
        // Integer to Double conversion
        Integer intValue = 50; // Integer wrapper class
        Double doubleValue = intValue.doubleValue(); // Convert Integer to Double

        System.out.println("Integer to Double Conversion:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        // Double to Integer conversion
        Double originalDouble = 99.99; // Double wrapper class
        Integer convertedInt = originalDouble.intValue(); // Convert Double to Integer (truncates decimal part)

        System.out.println("\nDouble to Integer Conversion:");
        System.out.println("Double value: " + originalDouble);
        System.out.println("Converted to Integer: " + convertedInt);
    }
}

/*  Output :

Integer to Double Conversion:
Integer value: 50
Converted to Double: 50.0

Double to Integer Conversion:
Double value: 99.99
Converted to Integer: 99

*/
