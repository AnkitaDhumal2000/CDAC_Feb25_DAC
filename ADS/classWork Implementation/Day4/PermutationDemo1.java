//permutation or backtracking 
class PermutationDemo1{

static void display(String str,String res) {
	  if(str.length() == 0){
		  
		  System.out.println(res+"");
		  return;
		 
	  }
	  for(int i =0;i<str.length();i++){
		  char ch =str.charAt(i);
		  String ros = str.substring(0,i) +str.substring(i+1);
		  display(ros,res+ch);
		  
	  }

   }

   public static void main(String[] args) {
   
        String s = "ABBCB";
		//Permutations: 6 different ways= 3!
		//Time complexity = O(n!)

		display(s, "");
		
		
		}
		
}

/* o/p : it will generate all possible combinates of that string

ABC
ACB
BAC
BCA
CAB
CBA

*/