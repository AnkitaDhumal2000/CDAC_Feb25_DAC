class Finally14 {
 public static void main(String[] args){
   
	 //Not a correct way to stop finally from execution
      try{
		  int k = 1/0;
	       System.exit(0); //finally exexute nahi hota
	      
		}catch(Exception e){
		    System.out.println("Exception aagaya!!");
			
		}
		finally{
		    System.out.println("Finally");
		}
	}
	
}