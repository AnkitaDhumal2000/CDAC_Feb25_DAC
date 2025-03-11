/* Q1.Write a Java program to declare and initialize all eight primitive data types and print their values. */

public class PrimitiveDataTypesQ1{
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;          // 8-bit signed integer
        short shortValue = 32767;      // 16-bit signed integer
        int intValue = 2147483647;     // 32-bit signed integer
        long longValue = 9223372036854775807L; // 64-bit signed integer

        // Floating-point types
        float floatValue = 3.14f;      // 32-bit floating point
        double doubleValue = 3.141592653589793; // 64-bit floating point

        // Character type
        char charValue = 'A';          // 16-bit Unicode character

        // Boolean type
        boolean booleanValue = true;   // true or false

        // Printing values
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
    }
}

/* Output :

byte: 127
short: 32767
int: 2147483647
long: 9223372036854775807
float: 3.14
double: 3.141592653589793
char: A
boolean: true

*/