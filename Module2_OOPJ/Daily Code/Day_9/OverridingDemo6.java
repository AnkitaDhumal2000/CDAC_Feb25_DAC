class Parent{
int i=100;
     void show(){
	      System.out.println("Parent Method: p1");
		  
		 } 
 }
 
class Child extends Parent{
    int num =50;
    void show(){
	super.show();//Parent class method :  call
	    System.out.println("Child Method: C1");
	}
	
	void display(){
	    System.out.println(num);
		System.out.println(i);//Preference child class
		System.out.println(super.i);//Parent class
	}
}
		
		
class OverridingDemo6{
    public static void main(String args[]){
	
	     Parent p = new Parent();
		 p.show();
		 
		 Child c =new Child();
		 c.show(); //Child class : show()
		 c.display();
		 
	}
}




/* Output :



*/
