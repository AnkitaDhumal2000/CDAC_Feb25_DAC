class Animal{
   void eat(){
         System.out.println("Parent class: Eat()");
    }

}

class Dog extends Animal{
     void bark(){
         System.out.println("Child class1: Bark()");
    }
}

class Cat extends Animal{
      void sound(){
         System.out.println("Child class2: Sound()");
    }
}

class HierarchicallInheritanceDemo{
      public static void main(String args[]){
	     Cat c1 = new Cat();
		 c1.eat();
		 c1.sound();
		 //c1.bark();
		 
		 Dog d1 = new Dog();
		 d1.bark();
		 //d1.sound(); we are not extending  cat so sound not acessible its hierarchical inheritance
		 d1.eat();
	  
	  }
}

/* Output : 
Parent class: Eat()
Child class2: Sound()
Child class1: Bark()
Parent class: Eat()  */