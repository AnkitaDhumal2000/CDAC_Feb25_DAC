class Employee{

     //Instance variable
	 private int empId;
	 private String empName;
	 private static int total; //static variable
	 
	 
	 //Instance method
	 void set(int id, String name,int t){
	           empId = id;
			   empName = name;
			   total =t;
		}
		
		//static method
		static void add(int a, int b)
		{
		      System.out.println(a+b);//5
		}
		
		void show()
		{
		      System.out.println(empId+" "+empName+" "+total);
		}
		
	}
	
	
	
	//Driver class
	class EmployeeDemo3{
	           public static void main(String args[]){
			   
			   Employee e1 = new Employee();
			                e1.set(111,"Rahul",11);
			   e1.show();
			   
			   Employee e2 = new Employee();
			   
			   e1.set(222,"Shital",12);
			   e1.show();
			   
			   Employee.add(2,3);
			   System.out.println(Employee.add(5,7));  //compile error its return type is void so it will not eturn any value.
			   System.out.println("Addition ="+add(15,17)); // It is Static method but not contains any main method so it reqired to specify class name before calling method.
			   
			   }
			 }