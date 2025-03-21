/*
 2. Implement ArithmeticException
Write a Java program that performs division by zero and catches the ArithmeticException.

*/

public class ArithmeticExceptionHomeWork2{
   public static void main(String[] args){
       try{
	      int result = 10/0;
		  System.out.println(result);
		  } catch(ArithmeticException e){
		  System.out.println("Caught ArithmeticException: "+e.getMessage());
		}
	}

}