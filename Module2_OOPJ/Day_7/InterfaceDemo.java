interface Animal{ //interface : Blueprint of class.
      void sound(); //Abstract method
	  
	  default void s(){ // by me (we shoould have to write default or private in method
		  System.out.println("S");
	  }
	  
}

class Dog implements Animal{
	
	public void sound (){
		System.out.println("Dog barks : Sound");
	}
	
}

class InterfaceDemo{
	public static void main(String args[]){
		 Animal a = new Dog();
		 
		 a.sound();
		 a.s(); // be me 
		
	}
}

/* Output :
Dog barks : Sound 
S

  */