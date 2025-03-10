/* Q5: Write a Java program to swap two numbers using the += and -= operators only */

public class Q05{
	public static void main(String[] args){
		int x = 3, y = 9;
		System.out.println("Before Swapping: \nX = " + x + "\nY = " + y); 
		x += y;
		y -= x;
		y = -y;
		x -= y;
		System.out.println("After Swapping: \nX = " + x + "\nY = " + y); 
	}
}

/* output : 
Before Swapping:
X = 3
Y = 9
After Swapping:
X = 9
Y = 3  */