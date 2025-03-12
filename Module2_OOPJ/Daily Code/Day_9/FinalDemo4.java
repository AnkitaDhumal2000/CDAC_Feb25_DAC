class Parent{

    final void display(){
	
	System.out.println("FInal Method :: Parent");
	
	}

}

class Child extends Parent{
       /*void display(){ //Error 
	       System.out.println("Final Method :: Child");
		} */

}

class FinalDemo4{

     public static void main(String args[]){
	 
	   // Parent p = new Parent();
		//p.display();
	     
		 Child c =new Child();
		 c.display();
	  
     }
	 
}

/* Error : 
error: display() in Child cannot override display() in Parent
       void display(){
            ^
  overridden method is final
  
*/