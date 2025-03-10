

class ArrayDemo11{


                  static int[] getArray(){
				           return new int[]{10,20,30};
				  }
	
			
			public static void main(String args[]){
			
			//Declared the array
			
			int[] a = getArray(); //10,20,30
			
			for(int x: a){
			
			            System.out.println(x);
						
						}
			
			
			}
			
			
		}
			
			/* output:
10
20
30  */