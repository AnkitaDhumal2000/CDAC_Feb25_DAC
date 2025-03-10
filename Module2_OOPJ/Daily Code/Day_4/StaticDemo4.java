class StaticDemo4{

           static int x =10; //static
		   static int y=20;//static
		   int z =30;//instance
		   
		   void show(){
		             x =20;
					 System.out.println(x);//ok
					 System.out.println(z);
					 
			}
			
			static void show1(){
			x=20;
			System.out.println(x); //ok
			//System.out.println(z); // Error Non static is not accessible (non static variable can not acess in static method)
		  }
		  
		 public static void main(String args[]){
		 
		 StaticDemo4 s1 = new StaticDemo4();
		 
		 s1.show();
		 //show();//Error : Instance method require reference object(object of class)
		 
		 show1();// no neeed of reference because it is static method of class which having main method
		 StaticDemo4.show1();
		 
		 
		 }
		 
		 }
		 
		 
		 /* *Output* : 20
		               30
					   20
					   20  */