class ExceptionDemo7{

    static void m1(){
	    System.out.println("M1 : executing");
		  m2();
		 
	}
	
	static void m2(){
		System.out.println("M2 : executing:");
	}


      public static void main(String[] args){
	  
	     int i=10;
		 int j=20;
		 
		 m1();
	  
	  
	  
	  }
}