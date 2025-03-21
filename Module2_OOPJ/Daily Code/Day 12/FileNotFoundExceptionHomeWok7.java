/* 7. Implement FileNotFoundException
Write a Java program that tries to open a file that does not exist using FileReader, and handle the FileNotFoundException.
*/

import java.io.*;

public class FileNotFoundExceptionHomeWok7{
    public static void main(String[] args){
	   try{
	     FileInputStream fis = new FileInputStream("nofile.txt");
		 fis.close();
		} catch(FileNotFoundException e){
		      System.out.println("Caught FileNotFoundException: " + e.getMessage());
		} catch(IOException e){
		      System.out.println("Caught IOException: " + e.getMessage());
		}
	}
	
}
	
/* Output :

Caught FileNotFoundException: nofile.txt (The system cannot find the file specified)

*/	