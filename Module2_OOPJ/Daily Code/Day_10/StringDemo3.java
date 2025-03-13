class StringDemo3{

   public static void main(String args[]){
        String s = "Good Morning";
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.substring(5,8));
		System.out.println(s.contains("oo"));
		System.out.println(s.indexOf("M"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.replace("M","j"));
		
		
   }
   
}

/* Output :
12
M
Mor

*/