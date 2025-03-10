class ArrayDemo13{

			public static void main(String args[]){
			
			        int clonearr[] = new int[5];
					
					for(int x : clonearr){
					       System.out.println(x);
						   
						   }
						   
						   //---------------
						   
						   int arr[]= {10,20,30};
						   int clonear[] = arr.clone();
						   
						   System.out.println(arr == clonearr);
						   System.out.println(arr[0] == clonearr[0]);
						   
						   
						   for(int x : arr){
						        System.out.println(x);
								
							}
							System.out.println("_________");
							for(int x : clonearr){
							   System.out.println(x);
							   
							   }
							   
							   int arr[] = {10,20,3,40,50};
							   for( int x : clonearr){
							        System.out.println(x);
									
									
								}
								
							}
							
						} /* 
You're getting an error because you're trying to redeclare the variable arr within the same scope. In Java, you cannot declare a variable with the same name in the same method.

Problems in Your Code:
Variable arr is redeclared:
int arr[] = {10,20,30}; (Declared first)
int arr[] = {10,20,30,40,50}; (Re-declared later, causing the error)
			
*/			

	