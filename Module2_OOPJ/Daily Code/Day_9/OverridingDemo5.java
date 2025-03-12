class Parent{
     void show(){
	      System.out.println("Parent Method: p1");
		  
		 } 
 }
 
class Child extends Parent{
    void show(){
	//super.show();//Parent class method :  call
	    System.out.println("Child Method: C1");
	}
}
		
		
class OverridingDemo5{
    public static void main(String args[]){
	
	     Parent p = new Parent();
		 p.show();
		 
		 Child c =new Child();
		 c.show(); //Child class : show()
	}
}

//

/* so if both class having same name method(methodoverriding) and we create child class referene then it will oprint child class method but 
if we want parent class first then child then we use super.show() below show method of child class  */

/* Output :

Parent MEthod: p1
Parent MEthod: p1
Child Method: C1

*/
