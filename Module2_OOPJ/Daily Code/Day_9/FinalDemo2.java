class FinalDemo2{
	final int SPEED_LIMIT; //Final variable
	
	FinalDemo2(int speed){ //default value set karna
	      SPEED_LIMIT = speed;
		  }
		  
	void display()
	{
		System.out.println(SPEED_LIMIT);
	}

     public static void main(String args[]){
	     
	   FinalDemo2 f1 = new FinalDemo2(120);
	   f1.display();
     }
	 
}

