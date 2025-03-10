class Employee{
      int i;String name;
	  
	  
	  Employee(){
	         System.out.println(i+name);
			 
			}
		Employee(int i, String name){
		         this.i = i;
				 this.name = name;
				 System.out.println(i+name);
		   }
		}
		
		
		class EmployeeDemo7{
		    public static void main(String args[]){
			
			   
			   Employee e1 = new Employee(1,"Rama");
			   Employee e = new Employee();
			   
			}
		}
		
		/* output : 
1Rama
0null  because dfault construct does not having any vallue assign and sysout require int + string so it will print its default value 0 and null */
*/