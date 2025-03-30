package Day16;
//Method 2 : Runnable

class MyRun implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" :"+Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
	   MyRun r1 = new MyRun();
	   
	   Thread t1 = new Thread(r1,"t1");
	   Thread t2 = new Thread(r1,"t2");
	   Thread t3 = new Thread(r1,"t3");
	   Thread t4 = new Thread(r1,"t4");
	   
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();

	}

}

/* Output :
 its processing is according to schedular so they are running randomly
0 :t1
1 :t1
2 :t1
3 :t1
4 :t1
0 :t4
1 :t4
0 :t3
1 :t3
2 :t3
3 :t3
4 :t3
0 :t2
1 :t2
2 :t2
3 :t2
4 :t2
2 :t4
3 :t4
4 :t4
*/ 
