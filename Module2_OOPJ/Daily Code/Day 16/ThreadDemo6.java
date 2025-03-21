package Day16;
//sleep(): introduce delay to stagger execution

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName()+" Sleeping");
        try {
		Thread.sleep(1000);
        }catch(InterruptedException e) {
        	e.printStackTrace();
        }
		System.out.println(Thread.currentThread().getName()+" Awaking and work done....");

	}
}
public class ThreadDemo6 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Started");
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		
		t1.start();
		try {Thread.sleep(10000);}catch(InterruptedException e) {}
		t1.start();
		try {Thread.sleep(10000);}catch(InterruptedException e) {}
		t2.start();


		
		System.out.println(Thread.currentThread().getName()+" Ended");


	}

}

/* Output :
 
 main Started
0 : Thread-0
1 : Thread-0
2 : Thread-0
3 : Thread-0
4 : Thread-0
Thread-0 Sleeping
Thread-0 Awaking and work done....
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:793)
	at OOPJ/Day16.ThreadDemo6.main(ThreadDemo6.java:31)
	
*/
