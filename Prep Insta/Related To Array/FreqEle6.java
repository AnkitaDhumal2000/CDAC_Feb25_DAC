/* 6. Java program to find the frequency of elements in an array */

import java.util.Arrays;
class FreqEle6
{
public static void countFreq(int arr[], int n)
{
boolean visited[] = new boolean[n];
Arrays.fill(visited, false);

// Traverse through array elements and
// count frequencies
for (int i = 0; i < n; i++) {

// Skip this element if already processed
if (visited[i] == true)
continue;

// Count frequency
int count = 1;
for (int j = i + 1; j < n; j++) {
if (arr[i] == arr[j]) {
visited[j] = true;
count++;
}
}
System.out.println(arr[i] + " occurs " + count +" times ");
}
}

// Driver code
public static void main(String []args)
{
int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
int n = arr.length;
countFreq(arr, n);
}
}

/* o/p 

10 occurs 4 times
30 occurs 2 times
20 occurs 2 times

*/

/* Way 2 -

import java.lang.*;

class Main
{
    public static void main (String[] args) {
        int[] arr = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        countFrequency(arr, size);
    }

    static void countFrequency(int[] array, int size)
    {

        for (int i = 0; i < size; i++){
            int flag = 0;
            int count = 0;

            for (int j = i+1; j < size; j++){
                if (array[i] == array[j]){
                    flag = 1;
                    break;
                }
            }

           // The continue keyword is used to end the current iteration 
           // in a for loop (or a while loop), and continues to the next iteration
            if (flag == 1)
                continue;

            for (int j = 0;j<=i;j++){
                if (array[i] == array[j])
                    count++;
            }
            System.out.println(array[i]+": "+count);
        }
    }
}

*/

/* way 3
import java.lang.*;
import java.util.Arrays;

class Main
{
    public static void main (String[] args) {
        int[] arr = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        countFrequency(arr, size);
    }

    static void countFrequency(int[] arr, int n)
    {

        Arrays.sort(arr);

        // Traverse the sorted array
        for (int i = 0; i < n; i++)
        {
            int count = 1;

            // Move the index ahead whenever
            // you encounter duplicates
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            System.out.println(arr[i] + ": " + count);


            count++;
        }
    }
}

*/