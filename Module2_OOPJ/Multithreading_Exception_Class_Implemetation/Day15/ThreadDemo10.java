package Day15;

public class ThreadDemo10 {

synchonized void m1() {
		System.out.println(Thread.currentThread().getName()+" Started-m1");
        try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" fineshed-m");

	}
	public static void main(String[] args) {
		ThreadDemo10 d1 = new ThreadDemo10();
		ThreadDemo10 d2 = new ThreadDemo10();

	}

}
