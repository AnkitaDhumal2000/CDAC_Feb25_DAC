/* 3. JAVA Program for Rhombus Star Pattern */

import java.util.Scanner;
public class Pattern3{
    public static void main(String[]args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter row col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for(int i=1; i<= row; i++) {
		         for(int j=1; j<=1; j++)
				     System.out.print(" ");
				for(int j=1; j<=col; j++)
				     System.out.print("*");
				System.out.println();
			}
		}
	}
	
/* o/p 
********
 ********
 ********
 ********
 ********
 ********
 ********
 ********
 */