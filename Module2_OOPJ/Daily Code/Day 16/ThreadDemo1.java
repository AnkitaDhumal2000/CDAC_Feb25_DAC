package Day16;

//method 1 : Thread class extends

class Mythread extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {

		Mythread t1 = new Mythread();
		t1.setName("T1");
		Mythread t2 = new Mythread();
		t1.setName("T2");
		Mythread t3 = new Mythread();
		t1.setName("T3");
		Mythread t4 =  new Mythread();
		t1.setName("T4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	}
	
	/* Output :
	0 : T4
0 : Thread-3
0 : Thread-2
1 : Thread-2
2 : Thread-2
3 : Thread-2
4 : Thread-2
5 : Thread-2
6 : Thread-2
7 : Thread-2
8 : Thread-2
9 : Thread-2
10 : Thread-2
11 : Thread-2
12 : Thread-2
13 : Thread-2
14 : Thread-2
15 : Thread-2
0 : Thread-1
16 : Thread-2
17 : Thread-2
18 : Thread-2
1 : Thread-3
1 : T4
2 : T4
3 : T4
4 : T4
5 : T4
6 : T4
2 : Thread-3
19 : Thread-2
1 : Thread-1
2 : Thread-1
3 : Thread-1
4 : Thread-1
5 : Thread-1
6 : Thread-1
7 : Thread-1
8 : Thread-1
9 : Thread-1
3 : Thread-3
7 : T4
8 : T4
9 : T4
10 : T4
11 : T4
12 : T4
13 : T4
14 : T4
15 : T4
4 : Thread-3
5 : Thread-3
6 : Thread-3
7 : Thread-3
8 : Thread-3
9 : Thread-3
10 : Thread-3
10 : Thread-1
11 : Thread-3
12 : Thread-3
13 : Thread-3
14 : Thread-3
15 : Thread-3
16 : Thread-3
17 : Thread-3
18 : Thread-3
19 : Thread-3
16 : T4
17 : T4
18 : T4
19 : T4
11 : Thread-1
12 : Thread-1
13 : Thread-1
14 : Thread-1
15 : Thread-1
16 : Thread-1
17 : Thread-1
18 : Thread-1
19 : Thread-1
*/
	 


