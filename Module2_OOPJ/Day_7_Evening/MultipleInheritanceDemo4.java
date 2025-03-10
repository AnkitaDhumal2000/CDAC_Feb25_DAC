//Nesting of interfaces


      interface OuterInterface1{
                void print();

                interface InnerInterface2{
				         void scan();
						 
					}
			}
			
			//Nesting interface are allowed to acess method of nested interfaces.
		class TestInterface implements OuterInterface1.InnerInterface2{  //nested using .
		        public void scan(){
				     System.out.println("Outer interface !");
				}
		}
		
		
		class MultipleInheritanceDemo4{
		
		public static void main(String args[]){
		
		     TestInterface t1 = new TestInterface();
			 t1.scan();
		  
		   }
		   
	}
	
/* Output :
Outer interface !

here class testinterface implements outerinterface . innerinterface
*/