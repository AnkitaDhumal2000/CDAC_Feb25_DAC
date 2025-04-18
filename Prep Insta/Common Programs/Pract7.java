/* Java Program to Check Leap Year or not */

public class Pract7
{
   public static void main(String [] args)
   {
       int n = 23;
	         checkPrime(n);
	}
	
	private static void checkPrime(int n)
	{
	    int count = 0;
		
		//negative numbers, 0 and 1 are not prime
		if(n < 2)
		{
		    System.out.println("The given is number " + n + " is not prime");
			System.exit(0);
			
			
		}
		//checking the number of divisors b/w [1, n]
		for (int i = 1; i<=n; i++)
		{
		    if(n % i ==0)
			count +=1;
		}
		
		//if count of divisors greater than 2 then its not prime
		if(count > 2)
		    System.out.println("The given number" +  n +"not pime");
		else
		    System.out.println("The given number" +  n + "prime");
        }
		
	}
	
	/* O/p : The given number23prime */
	
/* Using break

// Write a java program to check whether a given number is prime or not
public class Main
 {
   public static void main (String[]args)
   {

     int i, n = 13;
     boolean isprime = true;

     // 0 and 1 are not prime numbers also, negative numbers are not prime
     if (n < 2)
       {
          isprime = false;
       }
     else
       {
          for (i = 2; i < n; i++)
           {
            if (n % i == 0)
             {
              isprime = false;
                  break;
                }
        }
       }

     String result = isprime ? "Prime" : "not Prime";
     System.out.println ("The number " + n + " is : " + result);

     // Time Complexity : O(N)
     // Space Complexity : O(1)
     // This program is better than previous version as :
     // Condition for 0, 1 and negative numbers checked earlier
     // Loops runs b/w [2, n-1] rather than [1, n]

   }
 }
 */