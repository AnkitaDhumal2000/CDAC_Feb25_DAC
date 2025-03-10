import java.util.Scanner;


class ArrayDemo12{


               public static void main(String args[]){
			   
			     int a[] = {1,2,3};
                 int b[] = {11,12,13};
                 int c[] = {21,22,23};

                 

                 int arr[][] = new int[3][];
                 arr[0]=a;
                 arr[1]=b;
                 arr[2]=c;

              ///
                for(int i=0;i<arr.length;i++)
                   {

                       for(int j=0;j<arr[i].length;j++)

                        {
                             System.out.print(" "+arr[i][j]);
							 
						}
            
                  System.out.println();

             
    

			
	}
							  
											  
}
							
}

             /* output 
 1 2 3
 11 12 13
 21 22 23 */
			            