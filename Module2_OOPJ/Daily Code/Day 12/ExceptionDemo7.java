class ExceptionDemo7{
	
   void m1(){
    System.out.println("M1 :: Started");
	}
	
	public static void main(String[] args){
	       
		   System.out.println("Started");
		   
		   ExceptionDemo7 a = null; // 3 ways to assign reference , we are referincing null to refrence
		   try{
		        a.m1(); //Exception e : NPE
		   }finally{
		       System.out.println("Release resourses!!!");
		   }   
		   System.out.println("Finished");
		
		}
		
}

/* OutPut : we cannot catch the exception so we cannot reached to the finshed statument because of that.

Started
Release resourses!!!
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ExceptionDemo7.m1()" because "<local1>" is null
        at ExceptionDemo7.main(ExceptionDemo7.java:13)

*/