package Day15;

interface Hello{
	void sayHello(); //abstract method must have in one interface
}


interface HelloWorld{
	void msg();
}

public class AnonymousClassDemo9  {

	public static void main(String[] args) {
		Hello h1 = new Hello() {
			public void sayHello() {
			   System.out.println("Hello world!");	
		}

	};
	
	//----------
	HelloWorld h2 = new HelloWorld(){
		public void msg() {
			System.out.println("Testing");
		}
	};
	
	//call for method
	h1.sayHello();
	h2.msg();

    }
}

/* Output :

Hello world!
Testing

*/
