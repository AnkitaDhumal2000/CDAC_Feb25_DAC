/* Java Program to Replace Substring in a String */

public class SubStr20
 {
	  public static void main(String[] args)
	  {
     String originalString="Hello, World!";
	 String substringToReplace = "World";
	 String replacement = "Java";
	 
	 //Replace the substringToReplace
	 String modifiedString = replaceSubstring(originalString, substringToReplace, replacement);
	 
	 //print the modified string
	 System.out.println("Original String: " + originalString);
	 System.out.println("Modified String: " + modifiedString);
	 }
	 
	 public static String replaceSubstring(String original, String toReplace, String replacement)
        {
		   if(!original.contains(toReplace)) {
		       return original;
		}
		
		String modified = original.replaceAll(toReplace, replacement);
    return modified;
	}
	
	}
	
/* O/P :

Original String: Hello, World!
Modified String: Hello, Java!

*/
	 