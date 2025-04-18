/* 2.Search an Element in a Matrix in Java */

import java.io.*;
import java.util.*;
 
class SerArrMatr2{
    public static void main(String[] args)
    {
        int a[][] = {{0,1,12,3}, {4,5,6,7}, {8,9,10,11}};;
        
        int size = 4;
        int search = 6;
        int flag=0;

        for(int i=0; i<size; i++){

            for(int j=0; j<size; j++){
                if(a[i][j]==search){
                    System.out.println("Element is found at ("+ i+", "+ j +") position");
                    flag=1;
                    break;
                }
            }

            if(flag==1)
            break;
        }

        if(flag==0)
            System.out.println("Not found");
    }
}
/*op = Element is found at (1, 2) position */

/* 2nd way 

import java.io.*;
import java.util.*;
 
class Main {
    public static void main(String[] args)
    {
        int a[][] = {{0,1,12,3}, {4,5,6,7}, {8,9,10,11}};;
        
        int x = 6;
        int flag=0;

        int i=0, j=3;
  
        while (i < 3 && j >= 0)
        {
            if (a[i][j] == x)
            {
                System.out.println("Element is found at ("+ i+", "+ j +") position");
                flag=1;
                break;
            }
            
            if (a[i][j] > x)
                j--;
            else
                i++;
        }

        if(flag==0)
            System.out.println("Not found");
    }
}

*/