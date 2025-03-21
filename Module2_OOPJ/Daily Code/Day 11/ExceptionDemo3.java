class ExceptionDemo3{

  public static void main(String[] args){
    try{
	   int a = 100;
	   int result = a/0; //Exception
	 } catch(ArithmeticException e){
		 System.out.println("Cannot divide by Zero...");
	 }
	 
	 
 
	 //System.out.println(result);
	 
  }
  
}

/* Output :
Cannot divide by Zero...
*/