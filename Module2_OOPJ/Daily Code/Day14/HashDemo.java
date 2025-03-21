package Day14;

import java.util.HashSet;
import java.util.Set;
public class HashDemo {

	public static void main(String[] args) {
          Set<String> s1 = new HashSet<>();
          
          s1.add("Mango");
          s1.add("Banana");
          s1.add("Grapes");
          s1.add("Peru");
          s1.add("Mango"); //it is not print duplicate value again
          
          
          System.out.println(s1);
          
	}

}

/* OutPut : 

[Grapes, Mango, Peru, Banana] 
		
*/
