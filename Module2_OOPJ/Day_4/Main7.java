public class Test7{

  static int counter = 0;
  
  void increment() {
      counter++;
  
     }
  
   } 


   public class Main7{
         public static void main(String[] args){
                Test7 obj1 = new Test7();
                Test7 obj2 = new Test7();
				
			   obj1.increment();
	           obj2.increment();
			   
			   
			   System.out.println("Counter: " + Test7.counter);  //Shared across instances
	  
	  }
	 }
	 
	 /* Ootput :  */
	 