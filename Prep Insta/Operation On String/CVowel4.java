/* 4. Java program to count the number of vowels in a String */

import java.util.Scanner;

public class CVowel4{
        public static void main(String[] args){
		String s = "prepinsta";
		char[] c = s.toCharArray();
		int vowel=0;
		
		for(int i =0; i< s.length(); i++){
	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
	vowel++;
	}
	
	System.out.println("Vowels: " + vowel);
	}
	
}	

/* o/p Vowels: 3*/

/* 2nd way 
public class Main {
    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }
    // to count total number of vowel from 0 to n
    static int countVowels(String str, int n) {
        if (n == 1) return isVowel(str.charAt(n - 1));
        return countVowels(str, n - 1) + isVowel(str.charAt(n - 1));
    }
    // Main Calling Function
    public
    static void main(String args[]) {
        // string object
        String str = "prepinsta";

    // Total numbers of Vowel
    System.out.print("Total number of Vowel = ");
    System.out.println(countVowels(str, str.length()));
  }
}

*/