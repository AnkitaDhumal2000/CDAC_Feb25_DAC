/* 21. String Manipulation

Write a Java program that can read a student email address and display as output the name of the student and domain name.

An email address of a student is given in the form:

<name>@<Domain_name>.com/in

example 1:

Input: vipul@cdac.in

Output:

Name : vipul

Domain Name: cdac

example 2:

Input: tembulwar@gmail.com

Output:

Name: tembulwar

Domain Name: gmail

example 3:

Input: VipulTembulwar@yahoo.com

Output:

Name: VipulTembulwar

Domain Name: yahoo

Note: Assume there are only 3 domain names as given in above examples.

*/

import java.util.Scanner;

public class Practice2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student email:");
		String email = scanner.nextLine();
		scanner.close();
		
		//split email at '@' to separate name and domain
		String[] parts = email.split("@");
		
		if(parts.length == 2) {
		     String name = parts[0]; //Extract name before '@'
			 String domainPart = parts[1];
			 
			// Remove ".com" or ".in" from the domain name
			String domain = domainPart.replaceAll("\\.(com|in)$", "");
			
			// Display ouput
			System.out.println("\nOutput:");
			System.out.println("Name: " + name);
			System.out.println("Domain Name: " + domain);
		} else {
		  
		  System.out.println("Invalid email format.");
		  
		}
	}
}

/* OutPut :

Enter student email:ankita@.in

Output:
Name: ankita
Domain Name:

D:\Ankita CDAC\Module_2_oop_java\Exam Practice Program>javac  Practice2.java

D:\Ankita CDAC\Module_2_oop_java\Exam Practice Program>java  Practice2
Enter student email:Ankita@gmail.com

Output:
Name: Ankita
Domain Name: gmail

*/
        