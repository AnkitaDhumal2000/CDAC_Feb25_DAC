class ExceptionDemo11{

  public static void main(String[] args){
     System.out.println("Execution started");
     String s1 = "12";//String input
     String s2 = "0";//String input
	 
	 int i = Integer.parseInt(s1); //converted String to int
	 int j = Integer.parseInt(s2); //unboxing string to intiger conversion
     
     try{
	   
	   int result = i/j; //Exception => 12/0
	   
	   System.out.println(result);
	   
	 } catch(ArithmeticException e){
		 System.out.println("Cannot divide by Zero...");
	 }catch(NumberFormatException e){
		 System.out.println("Give integer numbers...");
	 }catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Use array element..");
	 }
	 System.out.println("Execution finished");
	 
 
	 
  }
  
}

/* Output :
Execution started
Cannot divide by Zero...
Execution finished
*/
