class Throw12{

   public static void main(String[] args){
        System.out.println("Started");
		
		try{
		    throw new NullPointerException();
		
		}catch(NullPointerException e){
		    e.printStackTrace();
			System.out.println(" Null ko invoke mat Karo!");
		}catch(ArithmeticException e){
		   e.printStackTrace();
		System.out.println("Null ko invoke mat Karo!");
		}catch(NumberFormatException e){
			 e.printStackTrace();
		System.out.println("Null ko invoke mat Karo!");
		}catch(RunTimeException e){
			 e.printStackTrace();
		System.out.println("Null ko invoke mat Karo!");
		}catch(Exception e){
			 e.printStackTrace();
		System.out.println("Null ko invoke mat Karo!");
		}catch(Throwable e){
			 e.printStackTrace();
		System.out.println("Null ko invoke mat Karo!");
		} finally{
			System.out.println("Finally!!");
		}
		
		System.out.println("Finished");
}
}
