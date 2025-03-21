class A{
	
	void m1() throws Exception{
	}
}

class B extends A{

  void m1() throws Exception, FileNotFoundException,
  ArrayIndexOutBoundException{
  
  }
  
}

class ChDemo5{
   
   public static void main("String args[])throws FileNotFoundException{
       A a = new A();
	   a.m1();
	}

}
   