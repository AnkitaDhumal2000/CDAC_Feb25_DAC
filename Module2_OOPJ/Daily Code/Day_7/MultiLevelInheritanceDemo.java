class Animal{

      int id =5;
      void display(){
           System.out.println("Parent class: p1");
	   }

}

class Dog extends Animal{
      int cid = 4;
      void childDisplay(){
           System.out.println("child class: C1");
	   }

}

class Babydog extends Dog{
int bcid =6;
    void babyDisplay(){
      System.out.println("BabyChild class: C1");
	  
	  }

}

class MultiLevelInheritanceDemo{
      public static void main(String args[])
	  {
	     Babydog b1 = new Babydog(); /*mumtiple inheritance : we did not to create very reference only last child have to create reference.*/
		 b1.babyDisplay();
		 b1.childDisplay();
		 b1.display();
		 
		 //Access instance variables from parent classes
		 System.out.println(b1.id);
		 System.out.println(b1.cid);
		 System.out.println(b1.bcid);
	  }
	  
}


/* Output :
BabyChild class: C1
child class: C1
Parent class: p1
5
4
6  */