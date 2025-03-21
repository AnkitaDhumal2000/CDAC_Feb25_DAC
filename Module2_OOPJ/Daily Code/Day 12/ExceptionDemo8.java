class ExceptionDemo8{
	
  
	public static void main(String[] args){
	    System.out.println("Start");

        String s1 = "15";
        String s2 = "0"; // if here is another value then no arithmetic eception then it will not execute catch block prints value then finally and end the progrm

        int i = Integer.parseInt(s1);	
        int j = Integer.parseInt(s2); //referrence to Primitve conversion : this is unboxing.		
		   
		try{
		    int k = i/j;
			System.out.println(k);			
		}
		catch(ArithmeticException e){
		     e.printStackTrace();
			 System.out.println("Arithmetic Exception");
		}finally{
		       System.out.println("Release the resources !!!");
		}
		System.out.println("Finished");
  }

}

/* OutPut :

without exception :
Start
3
Release the resources !!!
Finished

with exception :
Start
java.lang.ArithmeticException: / by zero
        at ExceptionDemo8.main(ExceptionDemo8.java:14)
Arithmetic Exception
Release the resources !!!
Finished

*/

