class FinalDemo2{
	final static  int SPEED_LIMIT=100; //Final variable
	
	void display()
	{
		System.out.println(SPEED_LIMIT);
	}

}

class FinalDemo3{

     public static void main(String args[]){
	     
	   FinalDemo2 f1 = new FinalDemo2();
	   f1.display();
     }
	 
}

