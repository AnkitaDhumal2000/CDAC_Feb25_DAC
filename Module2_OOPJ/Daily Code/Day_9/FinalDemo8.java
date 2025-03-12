class A{
    int cube(final int n){
		//n=n+1; //error cannot change final variable value
	    return n*n*n;
	}	
}


class FinalDemo8{

     public static void main(String args[]){
	
	 A a1 = new A();
	System.out.println(a1.cube(5));
	  
	 }
	 
}