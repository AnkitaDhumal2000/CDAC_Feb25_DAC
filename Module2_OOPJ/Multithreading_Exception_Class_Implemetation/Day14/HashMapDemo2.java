package Day14;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main (String[] args) {
		
			 Map<Integer, String> m = new HashMap<Integer, String>();
			 
			 m.put(1, "Aditya");
			 m.put(2, "Aditya");
			 m.put(3, "Aditya");
			 m.put(4, "Aditya");
			 m.put(4, "Aditya");
			 m.put(4, "Aditya");
			 m.put(5, "Aditya");
			 m.put(5, "");
			 System.out.println(m);
			 System.out.println(m.get(4));
			 m.remove(3);
			 System.out.println(m);
		 }
	}

/* 
OutPut :

{1=Aditya, 2=Aditya, 3=Aditya, 4=Aditya, 5=}
Aditya
{1=Aditya, 2=Aditya, 4=Aditya, 5=}


*/

