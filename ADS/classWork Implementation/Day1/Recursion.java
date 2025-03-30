// Recursion infinite loop

class Recursion {
	static int i=0;
    static void show(){
		i++;
		if(i<=5)//base condition
		{
		   System.out.println("Ji Girls...!!!");
           show();//recursive call
		}
	}
	public static void main(String[] args){
	show();
	}
}
