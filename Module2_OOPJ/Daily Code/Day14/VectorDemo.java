package Day14;
import java.util.List;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		List<String> a11= new Vector<>();
		a11.add("Tushar");
		a11.add("kiran");
	    a11.add("Isha");
	    a11.add("Pratik");
	    
	    System.out.println(a11);
	    
	    a11.remove(1);
	    System.out.println(a11);
	   
	}

}

/* OutPut :

[Tushar, kiran, Isha, Pratik]
[Tushar, Isha, Pratik]

*/
