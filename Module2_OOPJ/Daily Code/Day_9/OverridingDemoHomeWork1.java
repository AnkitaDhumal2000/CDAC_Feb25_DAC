class Parent{
    Parent(){
	    System.out.println("Parent Default Constructor");
		
		}
	}
	
class Child extends Parent{
      Child(){
	       //super();//this is optional, java automatically call's parent's default constructor.
           System.out.println("CHild Default Constructor");

        }
    }


public class OverridingDemoHomeWork1{
   public static void main(String args[]){
           System.out.println("Creating Child Object:");
              Child c = new Child(); // calls default constructors
        }
}		


/* Output : so if u use super or not it will by call default constructor 

Creating Child Object:
Parent Default Constructor
CHild Default Constructor

*/