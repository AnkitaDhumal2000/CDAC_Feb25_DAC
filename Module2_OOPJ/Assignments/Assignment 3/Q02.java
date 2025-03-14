/* Q2. 2. Reverse an Array

Reverse the given array in place.*/

public class Q02{

      public static void main(String[] args){
	         int arr[] = {1,2,3,4,5,6,7,8};
			 int low = 0,high = arr.length-1;
			 
			 System.out.println("Before:");
			 for(int n : arr){
			         System.out.println(n + " ");
			}
			
			while(low<high){
			       arr[high] =arr[high] + arr[low];
				   arr[low] = arr[high] - arr[low];
				   arr[high] = arr[high] - arr[low];
				   low++;
				   high--;
				   
			}
			
			System.out.println("\nAfter: ");
			for(int n : arr){
			         System.out.println(n + " ");
			}
		}
	}
	
/* Output :
Before:
1
2
3
4
5
6
7
8

After:
8
7
6
5
4
3
2
1
*/