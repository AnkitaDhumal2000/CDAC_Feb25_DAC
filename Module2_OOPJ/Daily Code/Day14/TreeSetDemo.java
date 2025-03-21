package Day14;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		 Set<Integer> t1 = new TreeSet<>();
		 
		 t1.add(3);
		 t1.add(6);
		 t1.add(9);
		 t1.add(2);
		 t1.add(6);
		 
		 System.out.println(t1);
		 

	}

}

/* OutPut :
[2, 3, 6, 9] not taking duplicate values 
*/
