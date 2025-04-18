/* 2.Java Program to find length of the string without using length function */

import java.util.Scanner;

public class LenStr2{
        public static void main(String[] args) {
		   int length=0;
		   
		   String s = "prepinsta";
		   for(char c1 : s.toCharArray())
		        length++;
			System.out.println("Length of String is : " + length);
		}
	}
	
/* O/P:
 
Length of String is : 9

*/