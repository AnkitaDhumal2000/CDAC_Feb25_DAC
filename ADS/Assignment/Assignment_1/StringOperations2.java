/*Problem  
 Write a program that performs the following operations on strings: 
1.	Check whether two given strings are anagrams of each other. 
2.	Identify the longest word in a given sentence. 
3.	Count the number of vowels and consonants in the same sentence. 
Input: 
String 1: listen   
String 2: silent   
Sentence: Practice makes a man perfect Output: 
Are 'listen' and 'silent' anagrams? true   
Longest word: Practice   
Vowels: 9, Consonants: 17 
 
*/ 
  
import java.util.Arrays;
public class StringOperations2 {

   //Function to check if twostring are anagrams
    public static boolean areAnagrams(String str1, String str2) {
	     // Convert to lowercase to ignore case sensitivity
		     str1 = str1.toLowerCase();
             str2 = str2.toLowerCase();
			 
			 
		// Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
    
    // Function to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // Split sentence into words
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    
    // Function to count vowels and consonants in a sentence
    public static int[] countVowelsAndConsonants(String sentence) {
        int vowels = 0, consonants = 0;
        String lowerCaseSentence = sentence.toLowerCase();
        
        for (char ch : lowerCaseSentence.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if it's a letter
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        // Input strings
        String str1 = "listen";
        String str2 = "silent";
        String sentence = "Practice makes a man perfect";
        
        // Check if the strings are anagrams
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram);
        
        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
        
        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }
}

/*
Are 'listen' and 'silent' anagrams? true
Longest word: Practice
Vowels: 9, Consonants: 15

*/	