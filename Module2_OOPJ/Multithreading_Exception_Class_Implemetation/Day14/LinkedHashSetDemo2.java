package Day14;

import java.util.HashSet;
import java.util.Set;


public class LinkedHashSetDemo2 {

			public static void main(String[] args) {
		          Set<String> s1 = new HashSet<>();
		          
		          s1.add("Mango");
		          s1.add("Banana");
		          s1.add("Grapes");
		          s1.add("Peru");
		          s1.add("Mango"); //it is not print duplicate value again
		          s1.add("Grapes");
		          s1.add("Grapes");
		          s1.add("Grapes");
		          s1.add("Grapes");
		          
		          System.out.println(s1);
		          
			
			
			


	}

}

/* Output :
[Grapes, Mango, Peru, Banana]

*/
