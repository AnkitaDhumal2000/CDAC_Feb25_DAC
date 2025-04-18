/* the Fibonacci Series up to Nth Term in Java */

public class Fibonacci13 {
    public static void main(String[] args) {
        int num = 15;
        int a = 0, b = 1;

        // Printing 0th and 1st terms
        System.out.print(a + " , " + b + " , ");

        int nextTerm;

        // Printing the rest of the terms
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}

/* o/p : 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144 , 233 , 377 , */

/*using Recursion 
public class Main
 {
   static int a = 0, b = 1, nextTerm;
   public static void main (String[]args)
   {

     int n = 15;
     // Here we are printing 0th and 1st terms
       System.out.print (a + " , " + b + " , ");

     // n-2 as 2 terms already printed
       Fib (n - 2);
   }

   static int Fib (int n)
   {
     if (n > 0)
       {
      nextTerm = a + b;
      a = b;
      b = nextTerm;

      System.out.print (nextTerm + " , ");
      Fib (n - 1);
       }
     return 0;

   }

 }  
 */
 
/* using static
public class Main
{
  static int a = 0, b = 1, nextTerm;
  public static void main (String[]args)
  {

    int n = 15;

      fib (n);
  }

  static void fib (int n)
  {

    int f[] = new int[n + 1];

    f[0] = 0;
    f[1] = 1;

    System.out.print (f[0] + " , " + f[1] + " , ");

    for (int i = 2; i < n; i++)
      {
	    f[i] = f[i - 1] + f[i - 2];
    	System.out.print (f[i] + " , ");
      }
  }

}
*/