interface A{
   default void msg(){
         System.out.println("A: Method of class A");
    }

}

interface B{
     default void msg(){
         System.out.println("B: Method of class B");
    }
}

class C implements A, B{
   /* public void msg(){
        System.out.println("C: Method of class C");
    } // same methods cannot varify :it will give reference class result.
*/
}


class MultipleInheritanceDemo1{
      public static void main(String args[]){
	     C c1 = new C();
		 c1.msg();
		 c1.msg();
		 c1.msg();
	  }
}
