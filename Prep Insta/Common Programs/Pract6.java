/* Find the Greatest of the Three Numbers in Java*/

class Pract6
	{
		public static void main(String [] args)
		{
			
    int num1 = 33, num2 = 35, num3 = 50;
	
	//checking if num1 is greatest
	if (num1 >= num2 && num1 >= num3)
	     System.out.println(num1 + " is the gratest");
		 
	//checking if num2 is greatest
	
	else if (num2 >= num1 && num2 >= num3)
	     System.out.println(num2 + " is the gratest");
		 
	else if(num3 >= num1 && num3 >= num2)
	     System.out.println(num3 + " is the gratest");
		 
		}
	}
	
/* O/p :

50 is the gratest

*/


/*
Using Ternary Operator :

public class Main
{
  public static void main (String[]args)
  {

    int num1 = 10, num2 = 20, num3 = 30;

     int temp, result;    
    
    // find the largest b/w num1 and num2 & store in temp
    temp = num1>num2 ? num1:num2;
    
    // find the largest b/w temp and num3 & finally printing it
    result = temp>num3 ? temp:num3;  
    System.out.println (result + " is the greatest");
  }
}

*/