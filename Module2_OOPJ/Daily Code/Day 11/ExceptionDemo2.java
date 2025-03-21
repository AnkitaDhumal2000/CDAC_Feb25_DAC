class ExceptionDemo2{

  public static void main(String[] args){
  
     int a=100;
	 int result = a/0;
	 System.out.println(result);
	 
  }
  
}

/* Compllile time xception :
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo2.main(ExceptionDemo2.java:6)
		*/
*/