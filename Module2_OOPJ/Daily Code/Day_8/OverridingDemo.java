class parent{

   void display(){
       System.out.println("Display()::Parent class");
	   }
	   
	 }
class Child extends Parent{
	 
	 void display(){ //Method Overriding
	 System.out.println("Display()::Child class");
	 }
}

class OverridingDemo{
    public static void main(String args[]){
	
	Child c1 = new Child();
	c1.display();
	   
	}
}
/* Output:
Display()::Child class
It only show child class display method  */