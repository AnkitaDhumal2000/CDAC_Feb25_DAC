/* 5.va Program for Hollow Rectangle Star Pattern*/
import java.util.Scanner;
public class Pattern5{
     public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
		  System.out.println("Enter row and col");
		  int row = sc.nextInt();
		  int col = sc.nextInt();
	for(int i=1; i<= row;i++){
	          for(int j = 1; j<=col; j++)
			     if((i==1 || i==col) || (j==1||j==col))
				 System.out.println("*");
				 else
				 System.out.print(" ");
				 
				 
			System.out.println();
		
		}
	}
}
/*op

Enter row and col
4 4
*
*
*
*

*
  *

*
  *

*
*
*
*
  
*/