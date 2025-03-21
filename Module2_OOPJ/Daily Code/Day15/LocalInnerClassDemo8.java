package Day15;

class OutClass{
	int x=100;
	//1.COnstructor instance
	public OutClass() {
		Innerclass local = new Innerclass();
		local.show();
	}
	
	//2.Instance in method
	void display() {
		System.out.println("Method 1: Outer class");
		
		Innerclass local = new Innerclass();
		local.show();
	}
	class Innerclass{
		void show() {
		System.out.println("Method 2 : Inner class");
	}
	
	//Local method: Instance
	//3.Inner class with it's instance
	void msg() {
		class InnerClass{
			void show() {
				System.out.println("Method 2 : Inner class");
			}
				
			}
		
		//4.Instance Block
		{
			Innerclass local = new Innerclass();
			local.show();
		}
		
		//5.Instance created
		Innerclass local = new Innerclass();
		//local.show();//Reason
	}
		
public class LocalInnerClassDemo8 {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		out.display();
	        }

	    }

	   }
	}

/* Output :
 
 100
Outer class : Method
200
Inner class
*/
