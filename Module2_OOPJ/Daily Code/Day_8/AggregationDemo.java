class Employee{
       int id;
	   String name;
	   Address a;//HAS-A Relationship with Address class
//we are giving one class address into this class connecting both classes


        Employee(int id, String name, Address a)  //storing instance variable and address of connection
        {
             this.id = id;
             this.name= name;
             this.a = a;
        }	

       void display()  // we are difining this class variablles n this class and address class variable in that respective class but we are calling both in this class only because refrence is here.
       {

         System.out.println(id+" "+name);
		 System.out.println(a.city+" "+a.state+" "+a.country);
		}
}


class Address{
     String city,state,country;
	 
     Address(String city,String state,String country)
	 {
	 
	     this.city = city;
		 this.state = state;
		 this.country = country;
	}

}

class AggregationDemo{
       public static void main(String args[]){
	         
			 Address a1 = new Address("New Mumbai","MH","India");            
			 Address a2 = new Address("Mumbai","MH","India");
			
			 Employee e1 = new Employee(111, "Virat",a1);
			 e1.display();
			 Employee e2 = new Employee(112, "Virat",a2);
			 e2.display();
	   
	   }
	}
	
/* Output :

111 Virat
New Mumbai MH India
112 Virat
Mumbai MH India

*/