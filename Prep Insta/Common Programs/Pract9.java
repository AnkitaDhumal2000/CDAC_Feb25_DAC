/* Find the Sum of the Digits of a Number in Java */

public class Pract9
{
  public static void main(String[] args)
   {
     int num = 12345, sum =0;
	 
	 //loop to find sum of digits
	 while(num!=0){
	    sum += num %10;
		num = num /10;
	}
	
	//output
	System.out.println("Sum of digits : " + sum);
	}
}

/* O/P :

Sum of digits : 15
*/

/* Using recursion 
public class Main
 {
   public static void main (String[]args)
   {

     int num = 12345, sum = 0;
       System.out.println ("Sum of digits : " + getSum (num, sum));
   }

   static int getSum (int num, int sum)
   {

     if (num == 0)
       return sum;

     sum += num % 10;
     return getSum (num / 10, sum);
   }
 }
 */