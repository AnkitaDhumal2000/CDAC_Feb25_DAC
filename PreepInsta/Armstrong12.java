/* 12. Check whether or Not the Number is an Armstrong Number in Java */

public class Armstrong12
{
  public static void main (String[]args)
  {
    int num = 407, len;

    // function to get order(length)
      len = order (num);

    // check if Armstrong
    if (armstrong (num, len))
        System.out.println(num + " is armstrong");
    else
        System.out.println(num + " is armstrong");

  }


  static int order (int x)
  {
    int len = 0;
    while (x != 0 )
      {
	len++;
	x = x / 10;
      }
    return len;
  }

  static boolean armstrong (int num, int len)
  {

    int sum = 0, temp, digit;
    temp = num;

    // loop to extract digit, find power & add to sum
    while (temp != 0)
      {
	// extract digit
	digit = temp % 10;

	// add power to sum
	sum = sum + (int)Math.pow(digit, len);
	temp /= 10;
      };

    return num == sum;
  }
}

/* o/p :

407 is armstrong

*/


/* Using Recursion 

import java.util.*;
import java.lang.*;

class Main {

    // Driver code
    public static void main(String[] args)
    {
        //variables initialization
        int num = 1634, reverse = 0;
        int len = order(num);

        if (num == getArmstrongSum(num, len))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");

    }

    private static int getArmstrongSum(int num, int order) {
        if(num == 0)
            return 0;

        int digit = num % 10;

        return (int) Math.pow(digit, order) + getArmstrongSum(num/10, order);
    }

    private static int order(int num) {
        int len = 0;
        while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
    }

}

*/