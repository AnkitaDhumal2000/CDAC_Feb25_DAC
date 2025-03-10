/* Q20: Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()). */

public class Q20{
	public static void main(String args[]){
		check(20);
		check(-120);
	}
	
	public static void check(int A){
		int result = (A>0)? A : -A;
		System.out.println("absolute value: " + result);
	}
}

/* Output :
absolute value: 20
absolute value: 120
*/