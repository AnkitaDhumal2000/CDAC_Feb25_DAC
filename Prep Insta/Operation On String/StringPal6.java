/* 6. Java program to check String is a palindrome or not */

import java.util.Scanner;

public class StringPal6{
    public static void main(String[] args) {
	    String s = "arora";
		String rev ="";
		for(int i = s.length()-1; i>=0; i--)
		    rev=rev+s.charAt(i);
	    if(s.equals(rev))
		         System.out.println("String is palindrome");
		else
		         System.out.println("String is not palindrome");
				 
			}
		}

/*  O/P:-

String is palindrome	

*/

/* 2nd Method :

import java.util.*;

public class Main {
    public static void main(String args[]) {
        String original = "Prepinsta", reverse = "";  // Objects of String class
        
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) 
        reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");
    }
}