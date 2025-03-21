package Day14;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapDemo3 {

	public static void main(String[] args) {
Map<Integer, String> m = new HashMap<Integer, String>();
        //<key, Value>
		
		m.put(101,  "Adi");
		m.put(2,  "Dhanush");
		m.put(3,  "Shweta");
		m.put(4,  "Shweta"); //not allowed
		m.put(5,  "Shweta"); 
		m.put(6,"Rohan");
		m.put(7," ");
		m.put(8,  " "); 
		m.put(9,  " "); 
		System.out.println(m);
		System.out.println(m.get(5));
		m.remove(3);
//		System.out.println(m);
		//order is preserved here we are giving in order getting the same order

	}

}

/* OutPut :

{2=Dhanush, 3=Shweta, 4=Shweta, 101=Adi, 5=Shweta, 6=Rohan, 7= , 8= , 9= }
Shweta

*/