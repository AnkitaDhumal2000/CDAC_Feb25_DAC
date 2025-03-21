/* 4. Implement NumberFormatException
Write a Java program that tries to convert a non-numeric string to an integer using Integer.parseInt() and catches the NumberFormatException. */


public class ArrayIndexOutOfBoundsExceptionHomeWork4{
     public static void main(String[] args){
	    try{
		    String numStr = "abc"; // non-numeric string
			int num = Integer.parseInt(numStr);
			System.out.println(num);
		} catch(NumberFormatException e){
		      System.out.println("Caught NumberFormatException: " + e.getMessage()); 
			  }
			}
			
}

/* Output :

Caught NumberFormatException: For input string: "abc"

*/