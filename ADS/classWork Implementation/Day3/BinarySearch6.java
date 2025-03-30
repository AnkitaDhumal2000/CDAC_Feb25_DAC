class BinarySearch6{

static int bsearch(int arr[],int x,int l,int h){

    if(h >= l) {
	  
	  int mid = l+(h-l)/2;
	  if(arr[mid] == x)
	      return mid;
	  if(arr[mid] > x)
	     return bsearch(arr,x,1,mid-1);
		 
	  return bsearch(arr, x, 1,mid-1);
	  
	  }
	  return -1;
	
	}

   public static void main(String[] args){
       
	   int arr[] = {10,20,30,40,50};
	   int n = arr.length;
	   
	   int key = 40;
	  
	   int result = bsearch(arr, key,0,n-1);
	   if(result == -1)
		   System.out.println("Element not Found!");
	   else
		  	System.out.println("Element Found!");
 
	   
	}
	
}

/* o/p :

Element not Found!

*/