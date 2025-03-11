class Parent{
    int x =10;
    Abc a2; //Ref of Abc:HAS-A : Weak dependency
}
	
class Child extends Parent{
    int y = 20;
}

class Abc{
	void m1(){
		Xyz x = new Xyz();
		x.start();
	}

}

class Xyz{
	void start(){
	}
}

class InheritanceDemo{
          public static void main(String args[]){
		  
		  Child c = new Child(); //Ref for hild class
		  Abc a = new Abc(); //Ref for Abc class
		  Abc a1;
		  
		}
		
}