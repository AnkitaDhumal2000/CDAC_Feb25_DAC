class A{
}

class B extends A{
	
}

class InstanceOpDemo{
        public static void main(String args[]){
			
		     InstanceOpDemo op1 = new InstanceOpDemo();
			 A a1 = new A();
             B b1 = new B();
			 
			 //Syntax:<object> instanceof <classname>
			 //op1 instanceof InstanceOpDemo
			 
			System.out.println(op1 instanceof InstanceOpDemo);
		    System.out.println(b1 instanceof A);
			System.out.println(b1 instanceof B);
			
		}
}
/* its just checking it is instance of that class or not

Output : true
true
true

*/