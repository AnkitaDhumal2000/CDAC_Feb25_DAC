class StaticDemo5{

           static int x =10; //static
		   static int y=20; //static
		   int z =30;//instance
		   
		   
		   static{
		           String name = "Rutuja";
				   
				  }
				  
		   
		   void show(){
		             x =20;
					 System.out.println(x);//ok
					 System.out.println(z);
					 
			}
			
			static void show1(){
			int m=5;
			x=20;
			System.out.println(m); //ok
			//System.out.println(z); // Error Non static is not accessible (non static variable can not acess in static method)
		  }
		  
		 public static void main(String args[]){
		 
		 StaticDemo5 s1 = new StaticDemo5();
		 
		 s1.show();
		 //show();//Error : Instance method require reference object(object of class)
		 
		 show1();// no neeed of reference because it is static method of class which having main method
		 StaticDemo5.show1();
		 
		 
		 }
		 
		 }