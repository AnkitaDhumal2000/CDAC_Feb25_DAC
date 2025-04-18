/*4Check for Perfect Square in Java */


public class ChkPerSqe4{

	static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {
		
			int sr = (int)Math.sqrt(x);
		
			return ((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args)
	{
		int x = 84;

		if (isPerfectSquare(x))
			System.out.print("True");
		else
			System.out.print("False");
	}
}

/* op
False
*/

/* 2nd way 

import java.io.*;

public class Main{

static void checkperfectsquare(int n)
{
	
	if (Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n)))
	{
		System.out.print("True");
	}
	else
	{
		System.out.print("False");
	}
}

public static void main(String[] args)
{
	int n = 49;
	
	checkperfectsquare(n);
}
}
*/