package Day15;

public class GenericDemo2 <T>{
	T x;
	GenericDemo2(T x){
		this.x = x;
   }
	
   public T show(){
	return this.x;
}

	public static void main(String[] args) {
         
		GenericDemo2<Integer> g1 = new GenericDemo2<>(15);
		GenericDemo2<Double> g2 = new GenericDemo2<>(15.4567877);
		GenericDemo2<String> g3 = new GenericDemo2<>("Generics");
		
		System.out.println(g1.show());
		System.out.println(g2.show());
		System.out.println(g3.show());
		
	}
}

/* Output :

15
15.4567877
Generics

*/
