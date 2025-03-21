/* 5. Implement IllegalArgumentException
Write a Java method setAge(int age) that throws an IllegalArgumentException if the age is negative or greater than 150.
*/

public class IllegalArgumentExceptionHomeWork5{
    public static void main(String[] args){
	  try{
	       setAge(-5);
		}catch(IllegalArgumentException e){
		    System.out.println("Caught IllegalArgumentException: " +e.getMessage());
		}
	}
	
public static void setAge(int age){
    if (age < 0 || age > 150){
	       throw new IllegalArgumentException("Age must be between 0 and 150.");
		}
		System.out.println("Valid age: " + age);
	}
}

/* OutPut :

Caught IllegalArgumentException: Age must be between 0 and 150.

*/