/* 3. Implement ArrayIndexOutOfBoundsException
Create an array of 5 elements and try to access an index that does not exist (e.g., index 10). Handle the exception properly. */


public class ArrayIndexOutOfBoundsExceptionWorkWork3{
    public static void main(String[] args){
	  try{
	     int[] arr = {1,2,3,4,5};
		 System.out.println(arr[10]); //out of bound
		} catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("Caugth ArrayIndexOutOfBoundsException: " + e.getMessage());
		     }
		}
		
}

/* OutPut :

Caugth ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5

*/
		
		