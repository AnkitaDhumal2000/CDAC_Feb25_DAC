public class Test6 {

int a; //Instance Variable
private String name; //private instance variable

void display(){
System.out.println("a: " + a);
System.out.println("Name: " + name);



}

public static void main(String args[]){

      Test6 obj = new Test6();
	  obj.a =10;
	  obj.name ="Java";
	  obj.display();
	  
	  
	  }
	 }
	 
	 /* Ootput : A :10
	 Name: Java */
	 