package Day14;

import java.util.ArrayList;

class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}
	
	
}
public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(11,"Anki"));
		a.add(new Employee(12,"Anta"));
		a.add(new Employee(38,"Akita"));
		a.add(new Employee(71,"Ankita2"));
		a.add(new Employee(15,"Ankitar"));
		a.add(new Employee(134,"Ankita6"));
		a.add(new Employee(66,"Ankita4"));
		
		System.out.print(a);
		
		  for(Employee x : a) {
			  System.out.println(x);
			  
		  }
		
		
		

	}

}
