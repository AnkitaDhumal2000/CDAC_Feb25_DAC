
// this is multiple inheritence using implementing interfaces 
interface Printer{
     void print();
}

interface Scanner{
       void scan();

	   
}

class Computer implements Printer, Scanner{   // class implements interfaces
     public void print(){
	    System.out.println("Printer method");
	 }
	 
	 public void scan(){
	 System.out.println("Scanner method");
       }
}

class MultipleInheritenceDemoSol1{
    public static void main(String args[]){
	
	Computer c = new Computer();
	c.print();
	c.scan();
	
	}
}

/* Output  
Printer method
Scanner method  */

