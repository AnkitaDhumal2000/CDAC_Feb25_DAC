/* 18. Java Program for Finding the Smallest and largest element in an array */

import java.util.Scanner;

public class LarSml18
  {
     public static void main(String args[])
	 {
	    
		int arr[] = {12, 13, 1, 10,34,10};
		
		int largest = arr[0],smallest=arr[0];
		
		for(int i=0; i<arr.length; i++)
		 { 
		   if(smallest > arr[i])
		     smallest = arr[i];
		   if(largest < arr[i])
		   largest = arr[i];
		   
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		}
    }
	
/* O/P :

1
34

*/

/* Recursion 

import java.util.Scanner;

public class Main
{
  static int getmin(int arr[], int n){
     if(n==1)
       return arr[0];

     return Math.min(arr[n-1], getmin(arr, n-1));
  }
  static int getmax(int arr[], int n){
     if(n==1)
      return arr[0];

     return Math.max(arr[n-1], getmax(arr, n-1));
  }
  public static void main(String args[])
  {

    int arr[] = {12, 13, 1, 10, 34, 10};
    int n = arr.length;
    System.out.println(getmin(arr, n));
    System.out.println(getmax(arr, n)); 
   }
}

*/