package Day14;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
        
		
		m.put(1,  "Adi");
		m.put(2,  "Dhanush");
		m.put(3,  "Shweta");
		m.put(4,  "Shweta"); //not allowed
		m.put(4,  "Shweta"); 
		m.put(4,"Rohan");
		m.put(4,  "Rohini"); 
		m.put(115," ");
		//m.put(,  " "); 
		System.out.println(m);
		System.out.println(m.get(4));
		m.remove(3);
		System.out.println(m);
		System.out.println(m.get(2));
		//order is not preserved here we are giving te ording but cannot getting the same order

	}

}

/* Output :

{1=Adi, 2=Dhanush, 3=Shweta, 4=Rohini, 5= }
Rohini
{1=Adi, 2=Dhanush, 4=Rohini, 5= }
Dhanush

*/
