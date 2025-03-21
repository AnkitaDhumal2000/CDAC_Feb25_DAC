/* Home-work
Implement the following questions to understand Exception handling properly:

Unchecked Exceptions (Runtime Exceptions)
Unchecked exceptions extend RuntimeException and do not require explicit handling with throws or try-catch.

1. Implement NullPointerException
Write a Java program where you initialize a String as null and try to call the .length() method on it. Handle the exception using a try-catch block.

*/



public class NullPointerExceptionHomeWork1{
         public static void main(String[] args){
		 String str = null;
		 try{
		      System.out.println("Length of  String: " + str.length());
	} catch (NullPointerException e){
	      System.out.println("Caught NullPointerException: " + e.getMessage());
		  
		}
	
	}
	
}

/* Output :

java NullPointerExceptionHomeWork1
Caught NullPointerException: Cannot invoke "String.length()" because "<local1>" is null

*/