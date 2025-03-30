package Day14;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>();
		//Key, Value>
		m.put(5,  "ROhan");
		m.put(101,  "Aditya");
		m.put(52,  "DHanush");
		m.put(3,  "Shweta");
		m.put(14,  "Shweta");
		m.put(6,  "Rohini");
		m.put(7,  "");
		m.put(8,  "");
		m.put(9,  "");
		System.out.println(m);
		//System.out.println(m.get(5));//
		//m.remove(3);
	    //System.out.println(m);
		

	}

}

/* OutPut :
 
{3=Shweta, 5=ROhan, 6=Rohini, 7=, 8=, 9=, 14=Shweta, 52=DHanush, 101=Aditya}

*/
