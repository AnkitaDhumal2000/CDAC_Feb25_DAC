class ExceptionDemo10{
	
  
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
		     //e.printStackTrace();
			 System.out.println("Arithmetic Exception");
		}
		catch(Exception e){
		     //e.printStackTrace();
			System.out.println("Exception");
		}catch(Throwable e) {
		    //e.printStackTrace();
		 System.out.println("Throwable Exception");
		}
		finally{
		  System.out.println("Release the resource !!!");
		}
		
	}
	
}

/* OutPut : here Hirearchi is important : like first object :Throwable : Exception : runtime : arithmetic,nullpointer,indexoutofbound,classclastException etc. 
		
Start
Arithmetic Exception
Release the resource !!!

8/
		
		