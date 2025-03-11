class Parent{
      static void display(){
	  System.out.println("Display()::Parent class");
	  }
	  
}

class Child extends Parent{
         @Override
		  static void display(){//method Overriding
		  System.out.println("Display()::Child class");
		  }
		}
		
		
class OverridingDemo2{
        public static void main(String args[]){
		
		      Child.display();
		}
	}
	

		