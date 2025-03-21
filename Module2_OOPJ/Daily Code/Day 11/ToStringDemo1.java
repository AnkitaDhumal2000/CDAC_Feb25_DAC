class ToStringDemo1{

     String name;
	 int id;
	 
	ToStringDemo1(String name, int id){
	      this.name = name;
		  this.id = id;
	}
	
	@Override //this is not require to write , Done overriding with toString () of Object Class
	public String toString(){
		return name+ " "+id;
	
	}
	
	public static void main(String args[]){
	       ToStringDemo1 t1 = new ToStringDemo1("ABC",111);
	        System.out.println(t1);  //By default toString method is called 
    }
	
}

/* Output :

ABC 111

*/