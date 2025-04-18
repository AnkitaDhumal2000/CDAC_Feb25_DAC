/* 5.Print Elements in Sorted Order using Row-Column Wise Sorted Matrix in Java */

import java.util.Arrays;

class Arr5{
    
    public static void main(String args[])
    {
        int mat[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};
        
        int n=4, m=4;
        
        int[] arr = new int[n*m];
        int x=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[x++]=mat[i][j];
            }
        }
    
        int size = n*m;
        Arrays.sort(arr);
    
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
}
/* op

10 15 20 25 27 29 30 32 33 35 37 39 40 45 48 50

*/

/* 2nd way

class Main
{
    static final int INF = Integer.MAX_VALUE;
    static final int N = 4;
 
    static void youngify(int mat[][], int i, int j)
    {
        int downVal = (i + 1 < N) ?
                    mat[i + 1][j] : INF;
        int rightVal = (j + 1 < N) ?
                     mat[i][j + 1] : INF;
 
        
        if (downVal == INF && rightVal == INF)
        {
            return;
        }
 
        if (downVal < rightVal)
        {
            mat[i][j] = downVal;
            mat[i + 1][j] = INF;
            youngify(mat, i + 1, j);
        }
        else
        {
            mat[i][j] = rightVal;
            mat[i][j + 1] = INF;
            youngify(mat, i, j + 1);
        }
    }
 
    static int extractMin(int mat[][])
    {
        int ret = mat[0][0];
        mat[0][0] = INF;
        youngify(mat, 0, 0);
        return ret;
    }
 
    static void printSorted(int mat[][])
    {
        for (int i = 0; i < N * N; i++)
        {
            System.out.print(extractMin(mat) + " ");
        }
    }
 
    public static void main(String args[])
    {
        int mat[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};
        printSorted(mat);
    }
}
 
*/