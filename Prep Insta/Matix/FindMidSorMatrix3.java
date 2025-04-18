/* 3. Find median in a row wise sorted matrix in Java */

import java.util.Arrays;
 
public class FindMidSorMatrix3
{
    
    public static void main(String[] args)
    {
        int r = 3, c = 3;
        int mat[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
        
        int[] arr;
         
     
        arr = new int[9];
        int x=0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[x++] = mat[i][j];
            }
        }
    
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){ 
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    
        System.out.println("Median of the given matrix is : "+ arr[4]);
      
    }
}

/* op
Median of the given matrix is : 5
*/

/* 2nd way

import java.util.Arrays;
 
public class Main
{
    
    static int binaryMedian(int m[][],int r, int c)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
         
        for(int i=0; i<r ; i++)
        {
           
            if(m[i][0] < min)
                min = m[i][0];
             
            if(m[i][c-1] > max)
                max = m[i][c-1];
        }
         
        int desired = (r * c + 1) / 2;
        while(min < max)
        {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;
             
            for(int i = 0; i < r; ++i)
            {
                 
                get = Arrays.binarySearch(m[i],mid);
                 
                if(get < 0)
                    get = Math.abs(get) - 1;
                 
                else
                {
                    while(get < m[i].length && m[i][get] == mid)
                        get += 1;
                }
                 
                place = place + get;
            }
             
            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }
     
    public static void main(String[] args)
    {
        int r = 3, c = 3;
        int m[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
         
        System.out.println("Median is " + binaryMedian(m, r, c));
    }
}
*/