/* Q7. 7.Rotete as Array 

Rotate the array to the right by k position

*/

public class Q07{
          public static void main(String[] args){
		  int arr1[] = {89,4,67,88,90};
		  print(arr1);
		  rotateright(arr1, 5);
		  System.out.println();
		  print(arr1);
		  
	}
	
	
	      public static void rotateright(int[] arr, int r){
	            r=r%arr.length;
			    reverse(arr, 0, arr.length-1);
			    reverse(arr, 0, r-1);
			    reverse(arr, r, arr.length-1);
			  
			  }
		  public static void reverse(int[] arr, int i, int j){
		     while(i<j){
			        arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
					i++;
					j--;
					
				}
		
		}
		
		public static void print(int[] arr){
			 for(int n: arr)
				  System.out.print(n + " ");
		}
		
}
	
/* Output :
 
89 4 67 88 90
89 4 67 88 90	
			
*/
