class A{

     void show(){
	    System.out.println("parent class");
		}
}

class B extends A{

    void show(){
	    System.out.println("Child class");
		}
	
}

class C extends B{
	
	void show(){
		System.out.println("Downcasting : samzha");
	}
	
}
class DowncastingDemo{
        public static void main(String args[]){
			  
			  A a1 = new A();
			  B b1 = new B();
			  A a2 = new B(); //upcasting : Polymorphism
		      //B a2 = new A()); //Not Correct downcasting
			  B b2  = (B)a2; //downcasting
			  b2.show();
			  
			  C c2 = (c) b2;
			  c2.show();
			
		}
}

/* classcast exception : because this is unsafe method of do downcasting.