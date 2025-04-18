/* 9. Java program to Remove spaces from a string */

import java.util.Scanner;

public class RemSpec9 {

	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  String s = "Prepinsta is best";
	  char[] c = s.toCharArray();
	  StringBuffer sb = new StringBuffer();
	  
	  
	  for (int i = 0; i < c.length; i++) {
	     if( (c[i] != ' ') && (c[i]!= '\t' )) {
	    	 sb.append(c[i]);
	     }    	
          }
	  System.out.println("String after removing spaces : "+sb);
    }
}

/* O/P:

String after removing spaces : Prepinstaisbest

*/

/* way 2 : Using Built in methods.

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
      StringBuffer sb = new StringBuffer();
	String s = "Prepinsta is best";
	String[] s1 = s.split("[\\s]");
	for (String string : s1) {
		sb.append(string);
	}
    System.out.println(sb);
   }
}

*/