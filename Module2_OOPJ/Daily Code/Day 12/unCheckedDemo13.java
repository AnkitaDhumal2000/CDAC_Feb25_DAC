class unCheckedDemo13{

   static m3(){
	   System.out.println("4");
       int i = 1/0; //Exception
   }
   static void m2(){
	   System.out.println("3");
   m3();
   }
   static void m1(){
	    System.out.println("2");
     m2();
	 } 
	 static void m(){
        System.out.println("1");
	    m1 ();
	 }
		public static void main(String[] args){
		   System.out.println("Started");
		   m();
		   
		   }
}