package Day15;

class OuterClass{
	int x = 100;
	
	public void display(){
		System.out.println("Outer class : Method");
	}
	
	class InnerClass{
		int y = 200;
		public void display1() {
			System.out.println("Inner class");
		}
		
	}
}
public class InnerClass5 {

	public static void main(String[] args) {
		OuterClass o1 = new OuterClass();
		
		System.out.println(o1.x);//100
		o1.display();
		
		OuterClass.InnerClass o2 = o1.new InnerClass();
		System.out.println(o2.y);//CE : Error
		o2.display1();

	}

}

/* Output :
 
 100
Outer class : Method
200
Inner class

 */
 
