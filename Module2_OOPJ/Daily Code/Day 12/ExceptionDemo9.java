class ExceptionDemo9{
	
  
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
		}
		catch(NullPointerException e){
		     e.printStackTrace();
			System.out.println("NullPointer Exception");
		}finally{
		       System.out.println("Release the resources !!!");
		}
		System.out.println("Finished");
  }

}

/* OutPut :multiple catch statment because on e progrm can have multiple exception so whaerver exception releted to that catch block it will executes

Start
java.lang.ArithmeticException: / by zero
        at ExceptionDemo9.main(ExceptionDemo9.java:14)
Arithmetic Exception
Release the resources !!!
Finished */