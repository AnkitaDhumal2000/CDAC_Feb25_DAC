class ExceptionDemo11{
	
  
	public static void main(String[] args){
	    System.out.println("Start");
        String ar[] = {"15", "0"};
        String s1 = ar[0];
        String s2 = ar[1]; 
		
        int i = Integer.parseInt(s1);	
        int j = Integer.parseInt(s2); //referrence to Primitve conversion : this is unboxing.		
		   
		try{
		    int k = i/j;
			System.out.println(k);			
		}catch(NumberFormatException | ArithmeticException | NullPointerException e ){
		     e.printStackTrace();
			System.out.println(" NumberFormatException Exception");
		}
		finally{
		  System.out.println("Release the resource !!!");
		}
		System.out.println("Finished");
	}
	
}

/* OutPut : multiple exception declration in catch

Start
java.lang.ArithmeticException: / by zero
        at ExceptionDemo11.main(ExceptionDemo11.java:14)
 NumberFormatException Exception
Release the resource !!!
Finished

*/

