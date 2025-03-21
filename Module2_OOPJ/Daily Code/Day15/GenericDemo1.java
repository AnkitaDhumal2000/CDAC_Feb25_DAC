package Day15;

public class GenericDemo1 {
	
	static <T>void display(T element) {
		System.out.println(element.getClass().getName()+ " " +element);
	}

	public static void main(String[] args) {
	
		display(11);
		display(11.4567878);
		display("Generics is to easy!");

	}

}

/* Output:
 java.lang.Integer 11
java.lang.Double 11.4567878
java.lang.String Generics is to easy!

*/
