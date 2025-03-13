class StringDemo2{
	
	 public static void main(String args[]){
		 //Method 1
		 String s1 = "ABC"; //String literal 
		 String s2 = "ABC";
		 String s3 = "ABCD";
		 String s4 = "ABCD";
		 
		 //== will compare reference content
		 //and not the object content 
		 System.out.println((s1 ==s2)); //reference pointing
		 System.out.println((s3 ==s4)); //false
		 System.out.println((s1 ==s3)); //false
		
        //Method 2		
		 String s5 = new String("ABC"); //Dynamically allocate
		 String s6 = new String("ABCD");// both will reffer ABCD in heap memory but internal reference is in string pool
		 System.out.println((s5 == s6));
		 System.out.println((s3 == s6));
		 //.equals()):we are comparing va
		 
		 //values of the reference
		 System.out.println((s1.equals(s5)));
		 System.out.println((s5.equals(s6))); //value content

         String s7 = new String("ABC");

         System.out.println(s1);
         s1.concat("XYZD");	
         System.out.println(s1);		 
         s1 = s1.concat("ZYZD");
         System.out.println(s1);
         s2 = s1.concat("XYZD");		 

	}

	 
}

/* 1 : true : it means s1 and s2 both reference pointing same oject or not 

true
true
false
false
false
true
false
ABC
ABC
ABCZYZD

*/

