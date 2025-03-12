class Parent{

     Parent(){
	          System.out.println("Parent Constructor::P1");
	 }
}

class Child extends Parent{
	
      Child(){
	   System.out.println("Child Constructor::C1");
     }
}

class OverridingDemo7{
     public static void main(String ags[]){
	 
	 Parent p = new Parent();
	 
	 Child c = new Child();
	 
	 }
	 
}