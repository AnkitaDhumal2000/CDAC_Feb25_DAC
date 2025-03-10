import java.util.Scanner;

class ArrayDemo8{


       public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	   int arr[][] = new int[3][3];
	   
	   
	   //input:
	   for(int i=0;i<3;i++){//row
	            for(int j=0;j<3;j++){//col
	           System.out.println("Enter element:");
			   arr[i][j] = sc.nextInt();
			   
			  }
			  
			 }
			 
			 
			 //System.out.println("--------------");
			 //for(int ar[] :arr)
				 
			 System.out.println("------------------");
		     for(int ar[] : arr)
			 {
			      for(int x : ar){
				  
				  System.out.print(" "+x);
				  }
				  System.out.println();
				 
            }
			
		}

				 
	}
	
	/* output :
	
	
Enter element:
5
Enter element:
6
Enter element:
2
Enter element:
3
Enter element:
4
Enter element:
5
Enter element:
6
Enter element:
6
Enter element:
5
------------------
 5 6 2
 3 4 5
 6 6 5