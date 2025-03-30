//Method 1

//Brute Force Approach (general approach (nested loop))
//Time Complexity: O(n^2)
//Space complexity: O(1)

class ArrayDuplicateDemo2{
  
  public static void main(String[] args){
	  
	  int[] arr = new int[] {1,2,3,4,5,2,7,8,8,3};
	  
	  for(int i=0;i<arr.length;i++){
		  for(int j=i+1;j<arr.length;j++){
			  if(arr[i] == arr[j])
				  System.out.println(arr[j]);
		  
	  }
  
     }
  }

}

/* o/p :

2
3
8

*/