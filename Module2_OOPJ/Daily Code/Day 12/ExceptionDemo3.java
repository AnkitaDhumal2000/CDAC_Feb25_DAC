class A{}
class B extends A{}
class ExceptionDemo3{

   public static void main(String[] args){
       System.out.println("Started");
	   A a= new A();
	   try{
	         B b=(B)a; //Downcasting: Exception e
	   }catch(ClassCastException e){
		   System.out.println(e.getMessage());
		   e.printStackTrace();
		   System.out.println("DownCast me Issue Hai !");
	   }
	   
	   System.out.println("Finished");
	   
	   }
}

/* OutPut : e.printStacktrace use to give explanaion of exceprion 
e.getMessage : to get details of exception
Started
class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
        at ExceptionDemo3.main(ExceptionDemo3.java:9)
DownCast me Issue Hai !
Finished

*/