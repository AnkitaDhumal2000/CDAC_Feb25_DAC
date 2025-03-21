package Day15;

import java.lang.reflect.*;
import java.lang.reflect.Method;

class Demo<T> {
	T x;
	
	private String s1 = "Learning Reflection";
	
	public Demo() {
	System.out.println("Demo:: Constructor1");
   }
	
   public Demo(T x){
	    this.x = x;
		System.out.println("Demo:: Constructor2");
	}
   public void display() {
	System.out.println("Demo :: Method");
     }

}
public class ReflectionDemo4 {

	public static void main(String[] args) {
		//Class reflection
		Class<?> d1 = Demo.class;
		System.out.println(d1.getName());
		
		//Constructor Refelction
		Constructor<?>[] c1 = d1.getDeclaredConstructors();
		System.out.println("Constructor : ---------");
		for(Constructor<?> constructor : c1) {
			System.out.println(constructor);
		}
		
		Method[] m1 = d1.getDeclaredMethods();
		System.out.println("Methods:-----");
		for(Method method : m1 ) {
			System.out.println(method);
				}
				
		Field[] f1 = d1.getDeclaredFields();
		System.out.println("Fields:----------");
		for(Field field : f1 ) {
		System.out.println(field);
	
	       }
    	}
	}

/* OutPut :
 
Day15.Demo
Constructor : ---------
public Day15.Demo()
public Day15.Demo(java.lang.Object)
Methods:-----
public void Day15.Demo.display()
Fields:----------
java.lang.Object Day15.Demo.x
private java.lang.String Day15.Demo.s1

*/

