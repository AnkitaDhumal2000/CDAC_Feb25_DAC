/* Check Whether a number is Even or Odd using Java  */

class Pract2 {
public static void main(String [] args){
            int number = 29;
			
			
			//checking whether the number is even or odd
			if (number % 2 ==0)
			    System.out.println(number + " is Even");
			else
			     System.out.println(number + "is odd");
			}
		}
		
/* O/p :

29is odd

*/

/* Using ternary 

public class Main
 {
   public static void main (String[]args)
   {
     int number = 29;

     //Checking if the number is divisible by 2
     String status = number % 2 == 0 ? " is Even" : " is Odd";
       System.out.println (number + status);
   }
 }
 
 */