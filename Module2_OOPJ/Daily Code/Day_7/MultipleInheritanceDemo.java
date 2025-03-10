class Animal{
   void msg(){
         System.out.println("A: Method of class A");
    }

}

class B{
     void msg(){
         System.out.println("B: Method of class B");
    }
}

class C extends A,B{
      void msg(){
         System.out.println("C: A: Method of class C");
    }
}


class MultipleInheritanceDemo{
      public static void main(String args[]){
	     C c1 = new C();
		 c1.msg();//its not alowing because all 3 have msg methods so its confusion :ambiguty for compiler so its not allow in java by extending class
	  
	  }
}

/* Output :

MultipleInheritanceDemo.java:14: error: '{' expected
class C extends A,B{
                 ^
1 error   

*/