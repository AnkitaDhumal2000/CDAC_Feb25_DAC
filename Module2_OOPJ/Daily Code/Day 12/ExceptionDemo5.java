class ExceptionDemo5{
	
   void m1(){
    System.out.println("M1 :: Started");
	}
	
	public static void main(String[] args){
	       
		   System.out.println("Started");
		   ExceptionDemo5 a = null; // 3 ways to assign reference , we are referincing null to refrence
		   try{
		        a.m1(); //Exception e : NPE
		   }catch(NullPointerException e) {
			   e.printStackTrace();
			   System.out.println("Null ko invoke mat Karo!");
		   }finally{
		       System.out.println("Release resourses!!!");
		   }   
		   System.out.println("Finished");
		
		}
		
}

/* Output : unchecked exception : runtime : NullPointerException

Started
java.lang.NullPointerException: Cannot invoke "ExceptioDemo4.m1()" because "<local1>" is null
        at ExceptionDemo5.main(ExceptionDemo5.java:12)
Null ko invoke mat Karo!
Release resourses!!!
Finished

*/
