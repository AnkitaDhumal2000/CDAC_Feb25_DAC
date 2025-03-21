package Day15;

class Oclass{
	static int x = 1;
	int a = 5;
	
	static void display() {
		System.out.println("Static method : M1");
		System.out.println(x);
		System.out.println(Iclass.y);
		//System.out.println(a);
			
		}
	
	 class Iclass{
		static int y = 100;
		
		static void display1() {
			System.out.println("Static method : M2");
			System.out.println(x);
			System.out.println(y);
			//System.out.println(a);
			
		}
	}
}
public class StaticInnerClassDemo7 {

	public static void main(String[] args) {
		Oclass o1 = new Oclass();
		System.out.println(o1.x);
		//System.out.println(o1.y)://Error
		
		Oclass.display();
		Oclass.Iclass.display1();
		o1.display();
		//o1.display1();//Error
		
		Oclass.Iclass o2 = o1.new Iclass();
		
		//System.out.println(o2.x);
		System.out.println(o2.y);
		
		
	}

}

/* 

Output :

1
Static method : M1
1
100
Static method : M2
1
100
Static method : M1
1
100
100

*/
