class Student{

     int id;
	 String name;
	 
	 
	 Student(int id,String name){
	           this.id = id;
			   this.name = name;//instance variable = parameter
			   
			   
			   
			 }
			 
			 
			
		}
		
		
		class ArrayDemo9{
		
		
		public static void main(String ags[]){
		
		Student[] s1 = new Student[3];
		s1[0] = new Student(111, "Shakar");
		s1[1] = new Student(222,"Radha");
		s1[2] = new Student(333,"Shital");
		
		
		for(Student s : s1){
		     System.out.println(s.id+" "+s.name);
			 
			 
			 }
			 
		}
		
	}
	
	/* output :
111 Shakar
222 Radha
333 Shital */