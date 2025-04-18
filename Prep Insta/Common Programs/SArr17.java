/*17. Java Code for finding the Smallest Element in an Array */

import java.util.Scanner;

public class SArr17
  {
     public static void main(String args[])
	 {
	 
	   int arr[] = {12,13,1,10,34,10};
	   
	   int min= arr[0];
	   
	   for(int i=0;i<arr.length;i++) {
	     if(min >arr[i])
		   {
		      min = arr[i];
			}
			
		}
		
		System.out.print(min);
		
	}
	
}