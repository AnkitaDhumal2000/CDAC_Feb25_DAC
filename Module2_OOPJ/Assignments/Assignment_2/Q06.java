/* 2. Relational & Logical Operators

Q6: Write a program to find the largest of thres numbers using only the temary operator (? :) */

public class Q06{
	public static void main(String[] args){
		int x=8, y=4, z=1;
		int res = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(res + " is the largest number.");
	}
}

/* output : 
8 is the largest number.   */