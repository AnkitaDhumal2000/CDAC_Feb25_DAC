// Parent default child parameterized

class Parent{
    Parent(){ //Default Constructor
	    System.out.println("Parent Default Constructor");
		}
}

class Child extends Parent{
   Child(String name){ //paameterized constructor
     super(); //calls parent's deault
	 System.out.println("Child Constructor::C1=" +name);
    }
}

class OverridingDemoHomeWork2{
        public static void main(String args[]){
			    System.out.println("Creating Child object:");
				Child c = new Child("Oops"); //calls parameterizes constructor of child
				
			}
	}
	
/* Output :

Creating Child object:
Parent Default Constructor
Child Constructor::C1=Oops

*/