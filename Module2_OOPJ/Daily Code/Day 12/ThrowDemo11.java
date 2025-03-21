class ThrowDemo11{
	
	void m1(){
	     System.out.println("M1 ::Started");
	}
	
  	public static void main(String[] args){
	      System.out.println("Started");
		  
		   ThrowDemo11 a = null;
		   try{
			    a.m1(); //throw ullPointerException e
		   //throw new RunTimeException e
		  // Throw new Exception e
		   }catch(NullPointerException e){
			   e.printStackTrace();
			   System.out.println("Null ko invoke mat karo!");
		   }
		   
		   System.out.println("Finished");

    
	}
	
}
