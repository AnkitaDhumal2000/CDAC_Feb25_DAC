/*  11. Check Whether or Not the Number is a Palindrome in Java */

// same question with recursion

public class Pract11_1{
    public static void main(String[] args)
	{  // variables initialization
	int num = 1201, reverse= 0, rem, temp;
	
	//plindrome if num and reverse are equal
	if(getReverse(num, reverse) == num)
	   System.out.println(num + " is Palindrome");
	else
	    System.out.println(num + " is not Palindrome");
		
		}
		
	static int getReverse(int num, int rev){
	  if(num ==0)
	      return rev;
		  
	  int rem = num % 10;
	  rev = rev * 10 + rem;
	  
	  return getReverse(num / 10, rev);
	  
	  
	}
	
}

/* o/p :

1201 is not Palindrome

*/