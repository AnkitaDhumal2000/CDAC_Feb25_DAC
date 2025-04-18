/* 10. Java program to count distinct element in an array */

import java.util.Arrays;

class CounDist10
{
   public static void countFreq(int arr[], int n)
   {
         boolean visited[] = new boolean[n];
         Arrays.fill(visited, false);
         int count_dis=0;
         // Traverse through array elements and
         // count frequencies
         for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
             continue;

           
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                   visited[j] = true;
                   
                }
            }
            count_dis = count_dis+1;
   }
   System.out.println(count_dis);
  }

   // Driver code
   public static void main(String []args)
   {
      int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10};
      int n = arr.length;
      countFreq(arr, n);
   }
}

/* o/p
5
*/

/* 2nd way :

import java.util.*;
import java.util.Arrays;

class Main
{
   static void countFreq(int arr[], int n)
   {
      Map<Integer, Integer> mp = new HashMap<>();
      int count_dis=0;
      // Traverse through array elements and
      // count frequencies
      for (int i = 0; i < n; i++)
      {
         if (mp.containsKey(arr[i]))
         {
           mp.put(arr[i], mp.get(arr[i]) + 1);
         }
         else
         {
           mp.put(arr[i], 1);
         }
     }
     
     System.out.println(mp.size());
  }
  // Driver code
  public static void main(String []args)
  {
       int arr[] = new int[]{10, 40, 50, 20, 10, 20, 30, 10};
       int n = arr.length;
       countFreq(arr, n);
  }
  
 */