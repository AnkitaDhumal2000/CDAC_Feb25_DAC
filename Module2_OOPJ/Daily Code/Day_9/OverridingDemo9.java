class GrandParent{
    
	GrandParent(){
	    System.out.println("GP");
	}

}


class Parent extends GrandParent {
      Parent(){
	  super(); // classa GP constructor
	   System.out.println("GP");
	   
	   }
	  
}

class Child extends Parent{

     Child(){
		//super();//call p constructor
		System.out.println("c");
		
		}

}

class OverridingDemo9{

    public static void main(String args[]){
	
	Child c = new Child();
	
	
	
	}
	
}