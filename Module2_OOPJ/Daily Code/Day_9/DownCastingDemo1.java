class Animal {
    void show(){
	   System.out.println("Parent Class");
	   }
	}
	
	
class Cat extends Animal{
   void Show(){
       System.out.println("Child class");
	   
	   }
	   
}


class DownCastingDemo1{
   Public static void main(String args[]){
   //Case 1
     /* Animal a = new Cat();    //Upcasting
	  Cat c= (Cat) a;    //Downcasting
	  c.show();    //child methos
	  
   //case 2
   /* Animal a1 = newAnimal();
	Cat c1 = (Cat) a;//Downcasting
	c1.show();//child method */
	
	
	//case 3
	Animal a2 = new Cat();    //Upcasting
	if(a2 instanceof Cat){
		  Cat c = (Cat) a2;
		  c2.show();//child method
	}else{
		
	  System.out.println("Downcasting : Not Possible");
	
	//case 4
	Animal a3 = new Animal();//child class visibility nahi hai
	 if(a3instanceofCat){
		    Cat c3 = (Cat) a3;
			c3.show();//child
	
	}
   }
	