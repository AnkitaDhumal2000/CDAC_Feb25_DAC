/* 3.Java program to toggle each character in a string */

import java.util.Scanner;

public class TogChar3{

          public static void main(String[] args){
		  String s = "prePInsTa";
		  String s1 ="";
		  for(int i=0;i<s.length(); i++){
		       if(Character.isUpperCase(s.charAt(i)))
			        s1=s1+Character.toLowerCase(s.charAt(i));
				else
				    s1=s1+Character.toUpperCase(s.charAt(i));
				}
				System.out.println("Toggle String is: " +s1);
			}
		}
		
/* O/p:

Toggle String is: PREpiNStA

*/

/* way : 2 The Logic is same here we are using the ASCII value

public class Main {

 public static void main(String[] args) {
    String str1 = "PrepInsta";
     char str[] = str1.toCharArray();

 for (int i = 0; i < str1.length(); i++) { if (str[i] >= 'A' && str[i] <= 'Z') str[i] = (char)(str[i] + 'a' - 'A'); else if (str[i] >= 'a' && str[i] <= 'z')
str[i]= (char)(str[i] + 'A' - 'a');
   }
System.out.println("Toggled string: ");
for (int i = 0; i < str1.length(); i++) {
 System.out.print(str[i]);
     }
  }
}
*/

/*  way 3:

public class Main {

    public static void main(String[] args) {

        String str1 = "PrepInsta";
        char str[] = str1.toCharArray();
        int i = 0;

        while (i < str1.length()) {
            if (str[i] >= 'a' && str[i] <= 'z') {               
           str[i] = (char)(str[i] + 'A' - 'a');           
 } 
else if (str[i] >= 'A' && str[i] <= 'Z') {
                str[i] = (char)(str[i] + 'a' - 'A');
            }
            i++;
        }

        System.out.println("Toggled string: ");
        for (i = 0; i < str1.length(); i++) {
            System.out.print(str[i]);
        }
    }
}

*/