/* 1.Spiral Traversal of a Matrix in Java */

import java.util.*;
 
class TraMatr1{
    static int R = 4;
    static int C = 4;
 
    static void print(int arr[][], int i, int j, int m, int n)
    {
        
        if (i >= m || j >= n) {
            return;
        }
 
        for (int p = i; p < n; p++) {
            System.out.print(arr[i][p] + " ");
        }
 
        for (int p = i + 1; p < m; p++) {
            System.out.print(arr[p][n - 1] + " ");
        }
 
        if ((m - 1) != i) {
            for (int p = n - 2; p >= j; p--) {
                System.out.print(arr[m - 1][p] + " ");
            }
        }
 
        if ((n - 1) != j) {
            for (int p = m - 2; p > i; p--) {
                System.out.print(arr[p][j] + " ");
            }
        }
        print(arr, i + 1, j + 1, m - 1, n - 1);
    }
 

    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        
        print(a, 0, 0, R, C);
    }
}
/* op

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

*/

/* 2nd way 

import java.io.*;
import java.util.*;
 
class Main {
    public static int R = 4, C = 4;
    public static boolean isInBounds(int i, int j)
    {
        if (i < 0 || i >= R || j < 0 || j >= C)
            return false;
        return true;
    }
 

    public static boolean isBlocked(int[][] matrix, int i,  int j)
    {
        if (!isInBounds(i, j))
            return true;
        if (matrix[i][j] == -1)
            return true;
        return false;
    }
 
    
    public static void spirallyDFSTravserse(int[][] matrix, int i, int j,int dir, ArrayList res)
    {
        if (isBlocked(matrix, i, j))
            return;
        boolean allBlocked = true;
        for (int k = -1; k <= 1; k += 2) {
            allBlocked = allBlocked && isBlocked(matrix, k + i, j)  && isBlocked(matrix, i, j + k);
        }
        res.add(matrix[i][j]);
        matrix[i][j] = -1;
        if (allBlocked) {
            return;
        }
 
        
        int nxt_i = i;
        int nxt_j = j;
        int nxt_dir = dir;
        if (dir == 0) {
            if (!isBlocked(matrix, i, j + 1)) {
                nxt_j++;
            }
            else {
                nxt_dir = 1;
                nxt_i++;
            }
        }
        else if (dir == 1) {
            if (!isBlocked(matrix, i + 1, j)) {
                nxt_i++;
            }
            else {
                nxt_dir = 2;
                nxt_j--;
            }
        }
        else if (dir == 2) {
            if (!isBlocked(matrix, i, j - 1)) {
                nxt_j--;
            }
            else {
                nxt_dir = 3;
                nxt_i--;
            }
        }
        else if (dir == 3) {
            if (!isBlocked(matrix, i - 1, j)) {
                nxt_i--;
            }
            else {
                nxt_dir = 0;
                nxt_j++;
            }
        }
        spirallyDFSTravserse(matrix, nxt_i, nxt_j, nxt_dir,
                             res);
    }
 
    // to traverse spirally
    public static ArrayList
    spirallyTraverse(int[][] matrix)
    {
        ArrayList res = new ArrayList();
        spirallyDFSTravserse(matrix, 0, 0, 0, res);
        return res;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        
        ArrayList res = spirallyTraverse(a);
        int size = res.size();
        for (int i = 0; i < size; ++i)
            System.out.print(res.get(i) + " ");
        System.out.println();
    }
}
*/