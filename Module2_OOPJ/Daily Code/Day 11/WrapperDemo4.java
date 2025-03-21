class WrapperDemo4{

      public static void main(String[] args){
	  
	       int a = 20; //Primitive Data 
		  
		   // Autoboxing: Primitive to wrapper class object
		   
		  // Integer b = new Integer(20); //wrapper class of integer datatype and a is reference
		   //Integer i1 = new Integer("20"); //String value
           //Integer i1 = new Integer.valueOf(a); //Explicit conversion (premitive(dtatype) to object class convert)		   
		
		//Method : 1 : ValueOf()
		
		Byte b = Byte.valueOf("20");
		Short s = Short.valueOf("20");
		Integer i =Integer.valueOf(a);
		Long l = Long.valueOf("20");
		
		//Method :2 Compliler automatic conversion.
		Integer j = a; //No Error .
		
		Integer i = Integer.valueOf("10110011",8);
	    System.out.println(j);
		}
		
}
		   
		   