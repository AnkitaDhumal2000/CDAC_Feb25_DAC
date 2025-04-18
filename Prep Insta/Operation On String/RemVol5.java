/* 5. Java Program to Remove Vowels from a String */

import java.util.Scanner;

public class RemVol5{

public static void main(String[] args){
String s = "prepinsta";
String s1 = "";
s1 = s.replaceAll("[aeiou]","");
System.out.println("String after removing vowel: " +s1);
   }
}

/* O/P :

String after removing vowel: prpnst

*/

/* 
// Java program to remove vowels from a String
import java.util.Arrays;
import java.util.List;

class Main {
    static String remVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    // Driver Code
    public static void main(String[] args) {
        String str = "Prepinsta";
        System.out.println(remVowel(str));
    }

}

*/