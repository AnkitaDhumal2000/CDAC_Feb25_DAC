/* Q1. Problem 1: 
 Given an array of integers, perform the following operations: 
1.	Find the second largest element in the array. 
2.	Move all zeros to the end of the array while maintaining the order of non-zero elements. 
Input:  arr = [10, 0, 5, 20, 0, 8, 15] Output: 
Second largest element: 15   
Array after moving zeros: [10, 5, 20, 8, 15, 0, 0] 
 
Constraints: 
●	Do not use built-in sort functions. 
 
●	The array may contain duplicate elements or zeros at any position. 
 
●	Array length ≥ 2. 
  
 */
 
import java.util.Arrays;

public class  ArayLarge1{

// Function to find the second largest element in an array
public static int findSecondLargest(int[] arr) {
    // Step 1: Assume the largest and second largest are the smallest possible values
	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	
	//Step 2: Loop through the array
	for(int i=0;i<arr.length; i++){
	    // If we find a number greater than the current largest
		if(arr[i] > largest) {
			secondLargest =  largest; // The old largest becomes second largest
			largest = arr[i]; // Update largest
		}
	}
	
	return secondLargest;
	
}
    // Function to move all zeros to the end while keeping non-zero elements in order

    public static void moveZerosToEnd(int[] arr){
		// Step 1: Use a pointer to track where to place non-zero elements
        int position = 0;
	// Step 2: Loop through the array and move non-zero numbers forward
	for(int i=0; i < arr.length; i++) {
		if (arr[i] != 0) {
			arr[position] = arr[i]; // Move the non-zero number to its correct place
			position++;
		
		}
	}
	
	// Step 3: Fill the remaining spaces with zeros
	while(position < arr.length) {
		arr[position] = 0;
		position++;
		
	}
	
	}
	
	
	public static void main(String[] args){
	     // Step 1: Define the array
         int[] arr = {10,0,5,20,0,8,15};

        // Step 2: Find and print the second largest number
     	int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element " + secondLargest);

        // Step 3: Move zeros to the end and print the updated array
		moveZerosToEnd(arr);
		System.out.println("Array  after moving zeros: " + Arrays.toString(arr));
		
	}

}

/* o/p :

Second largest element 10
Array  after moving zeros: [10, 5, 20, 8, 15, 0, 0]

*/
		



	
		
		
