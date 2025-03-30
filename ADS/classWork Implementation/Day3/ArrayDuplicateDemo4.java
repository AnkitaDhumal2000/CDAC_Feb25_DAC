// Method 3

//Using HashSet
//Time Complexity: O(n)
//Space complexity: O(1)

import java.util.*;
class ArrayDuplicateDemo4{
  
  public static void main(String[] args){
	  
	  int[] arr = new int[] {1,2,3,4,5,2,7,8,8,3};
	  //unsorted array
	  System.out.println(Arrays.toString(arr));
	  
	  Set<Integer> s1 = new HashSet<>();
	  for(int x : arr){
		  if(!s1.add(x)){
			  System.out.println("this is duplicate value" + x);
		  }
	  }
	  
	   
  
  }

}

/* O/P 

[1, 2, 3, 4, 5, 2, 7, 8, 8, 3]
this is duplicate value 2
this is duplicate value 8
this is duplicate value 3
