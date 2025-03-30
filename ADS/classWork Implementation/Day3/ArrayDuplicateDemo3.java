// Method 2

//Sorted Force Approach
//Time Complexity: O(n)
//Space complexity: O(1)

import java.util.*;
class ArrayDuplicateDemo3{
  
  public static void main(String[] args){
	  
	  int[] arr = new int[] {1,2,3,4,5,2,7,8,8,3};
	  //unsorted array
	  System.out.println(Arrays.toString(arr));
	  //sorted arrays
	  Arrays.sort(arr); //O(nlogn)
	  	  System.out.println(Arrays.toString(arr));

	  //Logic for dplicate indentification
	  for(int i=0;i<arr.length-1;i++){
	
			  if(arr[i] == arr[i+1])
				  System.out.println("duplicates values are " + arr[i]);
		  
	  } 
  
  }

}

/* 

[1, 2, 3, 4, 5, 2, 7, 8, 8, 3]
[1, 2, 2, 3, 3, 4, 5, 7, 8, 8]
duplicates values are 2
duplicates values are 3
duplicates values are 8

*/