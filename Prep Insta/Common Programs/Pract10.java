/* Reverse a given number in Java */

public class Pract10
{
   public static void main(String[] args)
   {
      //Variables initialization
	  int num = 1234, reverse = 0, rem;
	  
	  //loop to find reverse numberwhile(num !=0)
	while (num != 0)
	  {
	        rem = num %10;
			reverse = reverse * 10 + rem;
			num /= 10;
	  };
	  
	  //Output
	  System.out.println("Reversed Number: " + reverse);
	 }

}

/* 
Reversed Number: 4321
*/
/* Using for loop 

class Main
{
    public static void main (String[]args)
    {

        //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        for( ;num != 0; num = num/10)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
        };

        //output
        System.out.println ("Reversed Number: " + reverse);
    }
}

*/

/* Recursion 

public class Main
{
  public static void main (String[]args)
  {

    //variables initialization
    int num = 1234;

      getReverse (num);
  }

  static void getReverse (int num)
  {
    if (num == 0)
      return;

    int rem = num % 10;
    System.out.print (rem);

    getReverse (num / 10);

  }
}

*/