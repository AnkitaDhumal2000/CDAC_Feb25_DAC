package Day14;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new Hashtable<>();
		//<key,Value>
		m.put(5, "ROhan");
		m.put(101, "Aditya");
		m.put(52, "ROhani");
		m.put(3, "Shweta");
		m.put(6, "Ronn");
		m.put(7, "");
		m.put(8, "");
		m.put(9, "");
	System.out.println(m);
	
	}

}

/* OutPut :
 
 {9=, 8=, 52=ROhani, 7=, 6=Ronn, 5=ROhan, 3=Shweta, 101=Aditya}
 
 */
