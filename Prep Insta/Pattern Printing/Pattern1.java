/* 1. JAVA Program for Square Star Pattern */

import java.util.Scanner;
public class Pattern1{
     public static void main(String[] args){
		 
	       Scanner sc = new Scanner(System.in);
		   System.out.println("Enter no");
		   int n = sc.nextInt();
		    
			for(int i=0; i<n; i++) {
			    for(int j=0; j<n ; j++)
				   System.out.print("*");
				System.out.println();
		    }
		}
	}
	
/* O/P ::

Enter no
9
*********
*********
*********
*********
*********
*********
*********
*********
*********

*/