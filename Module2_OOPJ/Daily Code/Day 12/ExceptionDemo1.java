class ExceptionDemo1{
   public static void main(String[] args){
   
   int a=100;
   int result = a/0; //throw's an exception
   System.out.println(result);
   
      }
   
 }
 
/* OutPut :

Runtime Exception :
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo1.main(ExceptionDemo1.java:5)
		
		*/