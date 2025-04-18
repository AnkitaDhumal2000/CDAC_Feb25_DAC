/* 10. Java program to remove brackets from an algebraic expression  */

import java.util.Scanner;

public class RemBrac10 {

public static void main(String[] args) {
     
     String s = "(a+b)=c";
     String result = s.replaceAll("[(){}]","");
     System.out.println("Expression without brackets : "+result);
  }
}