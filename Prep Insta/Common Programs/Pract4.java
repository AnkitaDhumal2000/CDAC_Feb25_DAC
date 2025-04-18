/* Find the Sum of the Numbers in a Given Range in Java */

public class Pract4
 {
    public static void main (String[] args)
	{
	   int a = 5;
	   int b = 10;
	   
	   int sum = 0;
	   
	   for (int i = a; i <=b; i++)
	      sum = sum + i;
		System.out.println("The sum is " + sum);
		
		}
	}
	
/*  o/p : The sum is 45 */
	
/* Ternary 

public class Main
{
	public static void main(String[] args) {
	    int num1 = 2;
	    int num2 = 5;
	    int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
		System.out.println("The Sum is "+ sum);
	}
}

*/