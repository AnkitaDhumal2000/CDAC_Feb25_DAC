class Heapsort{

     void heapify(int arr[],int n, int i){
		 
	 int largest = i; //PArent
	 int l = 2*i+1; //LC
	 int r = 2*i+2; //RC
	 
	 //LC = largest 
	 if(l< n && arr[l] > arr[largest])
	    largest = l;
	//RC = largest
	if(r<n && arr[r] > arr[largest])
	   largest = r;
	 
     //Swap	 
	if(largest !=i){
	      int temp = arr[i];
		  arr[i] = arr[largest];
		  arr[largest] = temp;
		  
		  heapify(arr, n, largest);
		  
		  }
		  
	 }
		  
		  void heapsort(int arr[]) {
		  int n = arr.length;
		  //Checking left or right subtree balanced for max heap
		  
		  for(int i=n/2-1;i>=0;i--){
		      heapify(arr,n,i);
			}
			
			//Replacing root node with last node: swapping
				
			for(int i=n-1;i>0;i--){
				int temp = arr[0];
				arr[0] = arr[n-1];//root=last node
				arr[i] = temp;
				
				heapify(arr,i,0);
			
		  }
	 
	}

     void display(int arr[]){
          int n= arr.length;
          for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");

         }
    }


public static void main(String[] args) {
	
	int arr[] = {99,44,77,22,88,33,11,66,55};
	Heapsort h1 = new Heapsort();
	h1.heapsort(arr);
	h1.display(arr);

  }
 
}

/* O/P :-

99 99 99 99 99 99 99 88 99

*/

