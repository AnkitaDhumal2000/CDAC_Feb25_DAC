class ExceptionDemo12{

  public static void main(String[] args){
     System.out.println("Execution started");
     String ar[] = {"12","g"};
     
     try{
	   String s1 = ar[0];
	   String s2 = ar[1];
	   System.out.println(s1);
	   System.out.println(s2);
	   
	   int i = Integer.parseInt(s1); //converted String to int
	   int j = Integer.parseInt(s2); //unboxing string to intiger conversion
	   System.out.println(i);
	   System.out.println(j);
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
12
g
Give integer numbers...
Execution finished

*/
