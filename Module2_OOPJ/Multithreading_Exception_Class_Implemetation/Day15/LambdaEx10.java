package Day15;


@FunctionalInterface
interface Hellodd{
	void sayHello();
}

interface Double{
	int square(int n);
	
}

interface MathOp{
	int calculate(int a, int b);
}

public class LambdaEx10 {

	public static void main(String[] args) {
		Hellodd h1 = () -> System.out.println("Hello Lambda!"); //declaration of lamda function
	
        h1.sayHello();	
        
        Double d1 = (n) -> n*n ;
        System.out.println(d1.square(7));
       
        MathOp m1 = (a,b) -> a+b;
        System.out.println(m1.calculate(6,8));
        
        //Important for interview : can you implement runnable interface eith lambda iexpression
        Runnable r = () -> {
        	for(int i=1;i<=5;i++) {
        		System.out.println("Thread " + i);
        	}
        };
        
        Thread t = new Thread(r);
        t.start();
	    }

}

/* Output :

Hello Lambda!
49
14
Thread 1
Thread 2
Thread 3
Thread 4
Thread 5

*/
