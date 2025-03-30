class ArrayDemo {

  static int a1[] = new int[5];
  static int n=0;
  
  //display
  static void display(){
      for(int i=0;i<n;i++){
        System.out.println(a1[i]+"");
   }
}

//Isertion metod:
static void insert(int value){
    if(n < a1.length) {
         a1[n] = value;
	     n++;
	 
	}else{
	     System.out.println("Array is full!");
		 }
}

  //Key element FInd operation
  static boolean find(int key){
	  for(int i=0;i<n;i++){
		  if(a1[i] == key){
			  return true;
		  }
		  
	  }
	  return false;
	  
  }
  
  //Deletion Operation:
  
  static void delete(int key){
	  int i;
	  
	  //find element
	  for(i=0;i<n;i++){
		  if(a1[i] == key) {
			  break;//Found: exit the loop
			  
		  } 
		  
	  }
		  if(i == n)
			  System.out.println("Element does not exist!");
		      return;
	  }

	  //if exits shifting elements
	  for(int k=i;k<n;k++){
		  a1[k] = a1[k+1]; //shifting of all elements
	  }
	  n--;
  }
  
  

public static void main(String[] args){
	
	display();
	System.out.print("\n--------------\n");
	insert(10);
	insert(6);
	insert(90);
	insert(78);
	insert(76);
    //insert(776); Array is full
	
	System.out.print("\n--------------\n");
	display();
	
	System.out.print("\n--------------\n");
	/* int key = 6;
	if(find(key))
		System.out.print("Element Found!"+ key);
	else
	    System.out.print("Element not found!"+ key); */
	
	System.out.print("\n--------------\n");
	int key = 20;
	delete(key);
	
	display();

   }
   
}