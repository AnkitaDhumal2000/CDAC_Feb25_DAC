/* 15. Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.

Example:

Input:
Nums1=  {1,3,-7,3,2,3,1,-3,-2,-2}

num2= {1,3,-3,4,5,6}

nums 3 ={1,2,-2,3,4,5,6}

Output:

Sub-arrays w with 0 sam: [1,3-7,3]

Sub-arrays with 0 sam: [3, -7, 3,2, 3,1,-3,-2]

Sub-array with 0 sum : [1,2,-3]

Sub-arrays with 0 sum [2,-2]  */

import java.util.*;
public class Q15{
	public static void main(String[] args){
		
		int A[] = {1, 3, -7, -3, 2, 4, 1, -3, -2, 5};
		System.out.println(Arrays.toString(A));
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<A.length; i++){
			list.removeAll(list);
			int sum =0;
			for(int j=i; j<A.length; j++){
				sum += A[j];
				list.add(A[j]);
				if(sum==0){
					System.out.println(list.toString());
				}
			}
		}
	}
}

/* Output :

[1, 3, -7, -3, 2, 4, 1, -3, -2, 5]
[1, 3, -7, -3, 2, 4]
[3, -7, -3, 2, 4, 1]
[3, -7, -3, 2, 4, 1, -3, -2, 5]
[4, 1, -3, -2]
[-3, -2, 5]

*/

