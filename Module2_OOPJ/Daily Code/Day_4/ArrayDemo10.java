import java.util.Scanner;


class ArrayDemo10{


               public static void main(String args[]){
			           Scanner sc = new Scanner(System.in);
					   
					   //length : Array
					   //length() : String
					   
					   
					   int arr[] = new int[5];
					   
					   //Input in the array
					   for(int i=0;i<arr.length;i++)
					   {
					        System.out.println("Enter element:");
							arr[i] = sc.nextInt();
							
						}
						
						
						/*
						for(int i=0;i<arr.length;i++)
						{
						      System.out.println(arr[i]);
							  
						}  
						*/
						
						//for-each loop
						
						
						for(int a : arr){
						       System.out.println(a);
						
						
						
					}
						
					
					
				}
				
}  

 /* *output* : Enter element:
6
Enter element:
9
Enter element:
18
Enter element:
45
Enter element:
33
6
9
18
45
33  */
				