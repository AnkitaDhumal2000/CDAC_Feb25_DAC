class ExceptionDemo6{
	
   void m1(){
    System.out.println("M1 :: Started");
	}
	
	public static void main(String[] args){
	       
		   System.out.println("Started");
		   
		   ExceptionDemo6 a = null; // 3 ways to assign reference , we are referincing null to refrence
		   try{
		        //a.m1(); //Exception e : NPE
		   }finally{
		       System.out.println("Release resourses!!!");
		   }   
		   System.out.println("Finished");
		
		}
		
}
/* OutPut : even if there is no exception finally will run and release resource

Started
Release resourses!!!
Finished 

*/