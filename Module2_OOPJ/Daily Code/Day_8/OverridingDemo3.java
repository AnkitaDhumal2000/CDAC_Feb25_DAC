class Parent{ 
  protected voiddisplay(){
  System.out.println("Display()::Parent class");
  
  }
 }
 
 class child extends Parent{
 @Override
 //Protected or public
 
 void display(){ //Method Overriding
 //default : Error: Access modifier control
 
 System.out.println("Display()::Child class");
 
 }
 
}
  
  
class OverridingDemo3{
     public static void main(String args[]){
	 
	  Child c = new Child();
	  c.display();
	  
	}
}
  
  }