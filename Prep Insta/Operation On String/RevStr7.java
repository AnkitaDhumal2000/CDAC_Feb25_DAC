/* 7.Java Program to Reverse a String */

import java.util.Scanner;

public class RevStr7{
       public static void main(String[] args){
       String s = "Prepinsta";
StringBuilder sb = new StringBuilder();
sb.append(s);
System.out.println("String is: " +sb);
sb.reverse();
System.out.println("Reversed String is : " +sb);
      }

  }	   
  
/* O/P:

String is: Prepinsta
Reversed String is : atsniperP

*/

/* 2nd way

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String s = "prepinsta";
    String rev = "";

    for (int i = s.length()-1; i >=0; i--) {
      rev=rev+s.charAt(i);
    }
    System.out.println(rev);
  }
}

*/