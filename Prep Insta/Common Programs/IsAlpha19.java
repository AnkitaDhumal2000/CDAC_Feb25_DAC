/* 19 Java program to check a character is an alphabet or not */

import java.util.Scanner;

public class IsAlpha19
  {
    
	 public static void main(String args[])
	  {
	     char ch;
		 
		 ch = '9';
		 
		 if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z'))
		      System.out.println("The inserted charachter" + ch + "is an Alphabet");
		else
		      System.out.println("The inserted charachter "+ch + "is not an Alphabet");
		}
		
	}
	
/* O/p :

The inserted charachter 9is not an Alphabet

*/

/*

//Java program to check whether the character entered by the user is an alphabet or not.
import java.util.Scanner;

//class declaration
public class Main
{						
    
    //main method declaration
    public static void main(String[] args)
    {										
        char ch;
                         
        ch = 'k';
		
	//condition for checking characters
        if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
	      System.out.println("The inserted character " + ch + " is an Alphabet");
	else
	      System.out.println("The inserted character " + ch + " is not an Alphabet");
		
				                               
	
    } //end of the main method
    
} //end of the class

*/