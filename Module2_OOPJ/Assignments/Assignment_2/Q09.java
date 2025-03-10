/* Q9: Implement a ava program that checks if a numberbis within a specific range (20 to 50) without using if-else.
Hint : use logical AND(&&) in a print statement.*/

public class Q09{
	public static void main(String[] args){
		int x = 40, y = 52;
		check(x);
		check(y);
	}
	
	public static void check(int a){
		System.out.println((a>=20 && a<=50)? a + " lies in the range." : a + " doesn't lie within the range");
	} 
}	

/* Output : 
40 lies in the range.
52 doesn't lie within the range */