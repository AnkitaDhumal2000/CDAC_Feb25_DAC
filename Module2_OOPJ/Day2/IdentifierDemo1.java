/*1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.
*/

class IdentifierDemo1{
	void display(){
	}
	static void display(){
	}
	public static void main(String args[]){
		int x=10;
	}
                  } /* this is the error : IdentifierDemo1.java:7: error: method display() is already defined in class IdentifierDemo1
        static void display(){
Reason : Method Overloading Violation:(identifier cannot same they are only one)
You have two display() methods, one non-static and one static, with the same method signature (no parameters).
This is not allowed because Java does not differentiate methods based on static vs. non-static.*/
