/* Find the Greatest of the Two Numbers in Java */


class Pract5
  {
     public static void main(String[] args)
	 {
	 
	    int num1 = 50, num2 = 20;
		if (num1 == num2)
		   System.out.println("both are equal");
		else if (num1 > num2)
		   System.out.println( num1 + "is greater");
		   
		else
		   System.out.println(num2 + "is grater");
		   
		}
	}
	
/* o/p : 50is greater */
	
/* Using Ternary 

public class Main
{
  public static void main (String[]args)
  {
    int num1 = 50, num2 = 10, temp;

    if (num1 == num2)
      System.out.println ("Both are Equal\n");
    else
      {
	temp = num1 > num2 ? num1 : num2;
	System.out.println (temp + " is largest");
      }

  }
}
*/