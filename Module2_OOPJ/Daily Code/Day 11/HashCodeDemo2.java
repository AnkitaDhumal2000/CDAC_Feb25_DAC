class HashCodeDemo2{

   String name;
   int id;
   
   HashCodeDemo2(String name, int id){
          this.name = name;
          this.id = id;
   }
   
   @Override
   public int hashCode(){
       return id; //Using id as a unique hash code must be  return
   
   
   }
   
   
   public static void main(String[] args){
      HashCodeDemo2 t1 = new HashCodeDemo2("Abc",11);
	  System.out.println(t1.hashCode());//By  default toString 
   }
   
}

/* Output :

11

*/