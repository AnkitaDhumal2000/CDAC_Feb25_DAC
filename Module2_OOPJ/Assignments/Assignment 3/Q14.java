/* 14.write a program in java to accept 29 numbers in a single dimensional array arr[20]. Transfer and store all the even number in an array even[] and all the odd numbers in another array odd[ ]. finally, print the element of the even & the array */

import java.util.*;

public class Q14{
	public static void main(String[] args){
		int n = 20;
		Scanner sc = new Scanner(System.in);
		int[] even = new int[n];
		int[] odd = new int[n];
		int arr[] = new int[n];
		int evencount=0, oddcount=0;
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				even[evencount++] = arr[i];
			} else {
				odd[oddcount++] = arr[i];
			}
		}
		System.out.println("Odd Numbers: ");
		for(int i=0;i<oddcount; i++){
			System.out.print(odd[i] + " ");
		}
		
		System.out.println("\nEven Numbers: ");
		for(int i=0;i<evencount; i++){
			System.out.print(even[i] + " ");
		}
	}
}