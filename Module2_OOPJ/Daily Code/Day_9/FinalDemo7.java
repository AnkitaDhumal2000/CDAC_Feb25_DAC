//Immutable Reference

class FinalDemo7{

     public static void main(String args[]){
	
	     
	  final StringBuilder sb = new StringBuilder("CDAC");
      System.out.println(sb);
	 
	  sb.append("JUH-Kharghar");
	  System.out.println(sb);
	 }
	 
}

/* Output :  so it can allow us to appen (add another string into final string )
it means if we make object  as final and change reference value it will allow 

CDACJUH-Kharghar
*/