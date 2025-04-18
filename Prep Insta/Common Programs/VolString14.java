/* 14.Java Program to check a character is a Vowel or Consonant */

public class VolString14
  {
     public static void main(String[] args)
	 {
	 
	     char c = 'g';
		 
		 //Checking for vowels
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		     {
			       System.out.println(c + "is a vowel "); // condition true input is vowel
			 }
			 else
			 {
			      System.out.println(c + " is a consonant "); //condition true input is consonant
			 }
		}
			
	}
	
/* O/P :-

g is a consonant

*/