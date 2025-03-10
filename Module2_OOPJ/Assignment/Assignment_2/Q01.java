/* Q1: Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -.

Hint: Use bihwise XOR operator */

public class Q01{
	public static void main(String[] args){
		int a = 4;
		int b = 6;
		System.out.println("Before Swapping: \nA = " + a + "\tB = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: \nA = " + a + "\tB = " + b);
	}
}

/* Output :
Before Swapping:
A = 4   B = 6
After Swapping:
A = 6   B = 4   */