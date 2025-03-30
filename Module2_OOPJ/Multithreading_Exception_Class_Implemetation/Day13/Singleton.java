package Day13;

public class Singleton {
 //Step 1
	private static Singleton s1;
	
	//Step 2
	private Singleton() {
		System.out.println("Single reference instance is created !");
	}
	
	//steo 3
	public static Singleton getInstance() { // this methods return type is singletone class.
	   if(s1 == null) {
		s1 = new Singleton();//object wil be created 
	   }
	   return s1;
	}
	
	public void show() {
		System.out.println("Hello");
	}
	
	public static void main(String args[]) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		obj1.show();
		System.out.println(obj1 == obj2);
	}
	
}
