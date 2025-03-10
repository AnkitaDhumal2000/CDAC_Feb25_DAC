class DataDemo2{
public static void main(String args[]){

/*condition 1. byte b=130;  /* error : DataDemo2.java:3: error: incompatible types: possible lossy conversion from int to byte
byte b=130;

       ^
1 error    
Reason : The byte data
System.out.println(b); type in Java has a size of 8 bits (1 byte) and stores values in the range: (-128 -127) */

/* condition 2 : byte b=123.45; /*error : DataDemo2.java:12: error: incompatible types: possible lossy conversion from double to byte
byte b=123.45;
       ^
1 error 
Reason: 123.45 is a double by default :

In Java, decimal numbers are treated as double by default.
The byte data type only supports whole numbers (integers), not decimal values.
Byte Cannot Store Floating-Point Numbers

The byte type in Java can only store integer values ranging from -128 to 127.
123.45 is a floating-point (double) value, and Java does not allow direct assignment of double to byte because it would cause precision loss.
 */
 
 /* condition 3: byte b= true; /* error : DataDemo2.java:26: error: incompatible types: boolean cannot be converted to byte
 byte b= true;
         ^
1 error
Reason : boolean is a different data type

The boolean type in Java can only store true or false.
The byte type can only store integer values (whole numbers from -128 to 127).
Java does not allow implicit or explicit conversion between boolean and byte

Unlike some other languages (like C or Python), Java does not treat true as 1 and false as 0.
You cannot store a boolean value in an integer type (byte, short, int, etc.), and vice versa.
 */
 
 /* Condition 4: byte b= "shanker"; /* error : DataDemo2.java:26: error: incompatible types: boolean cannot be converted to byte
 byte b= true;
         ^
1 error
Reason : "shanker" is a String, not a byte

In Java, double quotes (" ") define a String.
A byte can only store integer values from -128 to 127, not text.
Java does not allow implicit or explicit conversion between String and byte

Unlike some languages (e.g., JavaScript, Python), Java strictly separates numeric and text types.
Even if the String contains a numeric value (e.g., "100"), you cannot directly assign it to a byte.
*/

System.out.println(b);
}
}
