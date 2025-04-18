/*ctorial of a Number in Java : Using for loop */
class fib14{
{
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    
    public static void main(String[] args)
    {
        int num = 6;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}


/* Using recursion 

class Main
{
	// method to find factorial of given number
	static int factorial(int n)
	{
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
	
	// Driver method
	public static void main(String[] args)
	{
		int num = 6;
		System.out.println("Factorial of " + num + " is " + factorial(num));
	}
}

*/