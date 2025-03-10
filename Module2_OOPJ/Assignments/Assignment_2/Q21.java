/* 5. Miscellaneous Operator Questions

Q21: Wite a program that increments a number without using+or++ operators.

Hint: Use bitwise -  (~x) */

public class Q21{
	static public void main(String me[]){
		int x = 5;
		System.out.println(-~x);
	}
}

/* Output :
6 
*/

