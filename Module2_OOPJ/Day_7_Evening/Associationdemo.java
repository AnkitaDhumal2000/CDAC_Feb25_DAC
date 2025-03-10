class Teacher{

   String name;
   
   Teacher(String name){
   this.name = name;
   }

}

class Student{

    String name;
	
	Student(String name){
	this.name =  name;
	}

}

class Associationdemo{

     public static void main(String args[]){
	 
	 Teacher t1 = new Teacher("Vipul sir");
	 Teacher s1 = new Student("Raviraj");
	 Teacher s2 = new Student("Jay");
	 System.out.println(t1.name+" "+s1.name+" "+s2.name);
	 
	    }
}
	 