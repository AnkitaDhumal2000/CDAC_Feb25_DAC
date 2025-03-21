package Day14;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;

class Employe{
	 int empId;
	 String empName;
	
	public Employe(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return  empId + " :=> " + empName;
	}
	
}

class EmployeComparator implements Comparator<Employe>{
	
	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o1.empId - o2.empId;
	}
	
}

class EmployeComparator1 implements Comparator<Employe>{
	
	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o2.empName.compareTo(o1.empName);
	}
	
}
public class CollectionDemo3 {

	public static void main(String[] args) {
		
		TreeSet<Employe> a = new TreeSet<Employe>(new EmployeComparator());
		a.add(new Employe(11, "Ravi"));
		a.add(new Employe(21, "Ravi1"));
		a.add(new Employe(51, "Ravi2"));
		a.add(new Employe(61, "Ravi3"));
		a.add(new Employe(14, "Ravi4"));
		a.add(new Employe(66, "Ravi5"));
		a.add(new Employe(41, "Ravi6"));
		
		System.out.println(a);
		
		for(Employe x : a) {
			System.out.println(x);
		}
		
		System.out.println("=======================");
		
		TreeSet<Employe> a1 = new TreeSet<Employe>(new EmployeComparator1());
		a1.add(new Employe(11, "Ravi"));
		a1.add(new Employe(21, "savi1"));
		a1.add(new Employe(51, "Ravi2"));
		a1.add(new Employe(61, "Tavi3"));
		a1.add(new Employe(14, "Kavi4"));
		a1.add(new Employe(66, "Aavi5"));
		a1.add(new Employe(41, "Mavi6"));
		
		System.out.println(a1);
		
		for(Employe x : a1) {
			System.out.println(x);
		}
		
	}

}

/* OutPut :
 
 [11 :=> Ravi, 14 :=> Ravi4, 21 :=> Ravi1, 41 :=> Ravi6, 51 :=> Ravi2, 61 :=> Ravi3, 66 :=> Ravi5]
11 :=> Ravi
14 :=> Ravi4
21 :=> Ravi1
41 :=> Ravi6
51 :=> Ravi2
61 :=> Ravi3
66 :=> Ravi5
=======================
[21 :=> savi1, 61 :=> Tavi3, 51 :=> Ravi2, 11 :=> Ravi, 41 :=> Mavi6, 14 :=> Kavi4, 66 :=> Aavi5]
21 :=> savi1
61 :=> Tavi3
51 :=> Ravi2
11 :=> Ravi
41 :=> Mavi6
14 :=> Kavi4
66 :=> Aavi5

*/
