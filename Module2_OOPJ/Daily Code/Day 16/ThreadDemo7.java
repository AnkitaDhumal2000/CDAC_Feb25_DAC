package Day16;

class counter extends Thread{
	int count = 0;
	void increment() {
		count++;
	}
}

public class ThreadDemo7 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Started");
		counter c1 = new counter();
		
		Thread t1 = new Thread(() ->{
			for (int i=0;i<10000;i++) {
				c1.increment();
			}
		},"T1");
		
		Thread t2 = new Thread(() ->{
			for (int i=0;i<1000;i++) {
				  c1.increment();
			}
		},"T2");

         t1.start();
         t2.start();
         
         t1.join();
         t2.join();
         
        System.out.println("Count = "+ c1.count);
		System.out.println(Thread.currentThread().getName()+" Finished");


	}

}

/*

main Started
Count = 10119
main Finished

*/