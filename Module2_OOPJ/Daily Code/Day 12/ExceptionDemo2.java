class ExceptionDemo2{
   public static void main(String[] args){
    
	System.out.println("Started");
	try{
	       System.out.println("Enerty Point in try block");
           int a=100;
           int result = a/0; //throw's an exception
           System.out.println(result);
    }catch(ArithmeticException e){
		//e.printStackTrace;
           System.out.println("Cannot divide by Zero.....");
	}
	
	System.out.println("Finished");
   
      }
   
 }
 
 /* OutPut :
 
Started
Enerty Point in try block
Cannot divide by Zero.....
Finished

*/