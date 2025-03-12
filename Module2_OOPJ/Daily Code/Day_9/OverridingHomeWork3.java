// 3. default  constructor : child , child parameterized : parent

class Parent {
  Parent (String name){ //only parent
      System.out.println("Parent Constructor::P1=" +name);
	  
	 }
}

class Child extends Parent{
    Child(){ //default constructor in child
	super("java");// Must explicitly call parent's parameterizes constructor
	System.out.println("Child Default Constructor");
	
	
	}
	
}


class OverridingHomeWork3{
    public static void main(String args[]){
	   System.out.println("Creating Child Object:");
	   Child c = new Child(); //Calls Child's default constructor.
	   
	}
}

/* Output :

Creating Child Object:
PArent Constructor::P1=java
Child Default Constructor

*/