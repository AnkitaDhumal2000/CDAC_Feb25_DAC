/* Q18: Given a student's percentage, print "Pass" if the percentage is 40 or above; otherwise, print "Fail", using only the temary operator. */

public class Q18{
	public static void main(String args[]){
		check(50);
		check(39);
	}
	
	public static void check(int a){
		String result = (a>=40)? "Pass" : "Fail";
		System.out.println(result);
	}
}

/* Output :
Pass
Fail
*/