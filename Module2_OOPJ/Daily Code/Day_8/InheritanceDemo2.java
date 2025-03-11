class Parent{
	int x =10;
}

class Child extends Parent{
	int y=20;
}


class InheritanceDemo2{
	public static void main(String args[]){
		
		Parent p1 = new Parent();
		System.out.println(p1.x);
		//System.out.println(p1.y);//Error
		
		Child c = new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		
		
		Parent p = new Child();// Upcasting
		
		System.out.println(p.x);
		System.out.println(p.y);
	}
}

/* Output : InheritanceDemo2.java:25: error: cannot find symbol
                System.out.println(p.y);
                                    ^
  symbol:   variable y
  location: variable p of type Parent
1 error

*/