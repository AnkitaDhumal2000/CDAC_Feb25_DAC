class Employee{
	String name;
	Employee(String name){
		this.name = name;
	}
	
}


class GarbageCollectionDemo1{

    protected void finalize(){
	      System.out.println("Finalize Method called....");
		  }
   public static void main(String args[]){
       
	   Employee g1 = new Employee("Java");
	   g1 = null; //nulling the reference
	   
	   System.gc(); // Request GC type 1of request
	   Runtime.getRuntime().gc();
   
   
   }
   
}

/* Output :

Note: GarbageCollectionDemo1.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

Finalize Method called....

*/