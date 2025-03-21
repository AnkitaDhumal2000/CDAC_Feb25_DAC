/* Checked Exceptions
Checked exceptions extend Exception and must be either handled using try-catch or declared with throws.

6. Implement IOException
Write a Java program that attempts to read from a file that does not exist and catches IOException. */


import java.io.*;

public class IOExceptionHomeWork6 {
          public static void main(String[] args) {
		     try{
			 FileReader fileReader = new FileReader("nonexistentfile.txt");
			 fileReader.close();
			}catch(IOException e){
			    System.out.println("Caught IOException: " + e.getMessage());
			}
		}
	}
	
/* Output :

Caught IOException: nonexistentfile.txt (The system cannot find the file specified)


*/