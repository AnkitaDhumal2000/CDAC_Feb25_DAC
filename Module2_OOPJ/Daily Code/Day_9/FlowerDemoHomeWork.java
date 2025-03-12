class Flower{
    String name;
	String color;
	boolean hasFragance;
	
	Flower(String name, String color, boolean hasThorns){
	     this.name = name;
		 this.color = color;
		 this.hasFragance = hasFragance;
		 }
		 
	void display(){
	    System.out.println("Flower Name: " + name);
		System.out.println("Color: " + color);
	    System.out.println("Has Fragrance: " + (hasFragance ? "Yes":"No"));
		
		}
		
	}
	
class Rose extends Flower{
    boolean hasThorns;
	
	Rose(String name, String color, boolean hasFragance, boolean hasThorns){
	      super(name,color,hasFragance); //base class
		  this.hasThorns=hasThorns;
		  }
		  
	void display(){
	    super.display();
		System.out.println("Has Throns:"+(hasThorns ?"Yes":"No"));
		System.out.println();
		
		}
}

class Lily extends Flower{
     boolean isWaterPlant;
	 
	 Lily(String name,String color,boolean hasFragance,boolean isWaterPlant){
	 super(name,color,hasFragance);
	 this.isWaterPlant=isWaterPlant;
	 }
	 void display(){
	   super.display();
	   System.out.println("Grows in Water:"+(isWaterPlant?"Yes":"No"));
	   System.out.println();
	   }
}

public class FlowerDemoHomeWork{
    public static void main(String args[]){
	     Rose r = new Rose("Rose","Red",true,true);
		 Lily l = new Lily("Lily","White",true,true);
		 
		 System.out.println("----Rose Details----");
		 r.display();
		 
		 System.out.println("----Lily Details----");
		 l.display();
	  }
}

/* Output :

----Rose Details----
Flower Name: Rose
Color: Red
Has Fragrance: No
Has Throns:Yes

----Lily Details----
Flower Name: Lily
Color: White
Has Fragrance: No
Grows in Water:Yes

*/