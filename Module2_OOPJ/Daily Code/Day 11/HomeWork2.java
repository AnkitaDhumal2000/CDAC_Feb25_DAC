/* Ques.2
Create an interface Photosynthesis, which represents the ability of plants to absorb sunlight and perform photosynthesis. This interface should contain a method void absorbSunlight(); that defines how plants absorb sunlight. Additionally, create another interface Respiration, which represents the respiration process in plants. This interface should include a method void releaseOxygen(); that defines how plants release oxygen.

Next, implement a concrete class Plant that inherits from both interfaces, demonstrating multiple inheritance. The Plant class should have a private attribute plantName to store the name of the plant, which should be initialized using a constructor Plant(String name). Additionally, it should have a method getPlantName() to return the name of the plant. The class should override the absorbSunlight() method to print the message "Plant is absorbing sunlight for photosynthesis." and override the releaseOxygen() method to print "Plant is releasing oxygen through respiration.".

In the main method, test the implementation by creating objects of the Plant class for two different plants: "Mango Tree" and "Fern". For each object, display the plant's name, call the absorbSunlight() method, and call the releaseOxygen() method.

=== */

//Define The Photosynthesis interface
interface Photosynthesis {
	void absorbSunlight();
}

//Define the Respiration interface
interface Respiration{
	void releaseOxygen();
}

//Implement the Plant class that inherits from both interface
class Plant implements Photosynthesis,Respiration{
	private String plantName;
	
	
 //Constructor to indicate the plant name
 public Plant(String name){
	 this.plantName = name;
 }
 
 //method to get the plant name
 public String getPlantName(){
	 return this.plantName;
 }
 
 
 //Override the absorbSunlight method
 @Override
 public void absorbSunlight(){
	 System.out.println("plant is absorbing sunlight for photosynthesis.");
 }
 
 //Override the releaseOxygen method
 @Override 
 public void releaseOxygen(){
	 System.out.println("Plant is releasing oxygen through respiration.");
   }
}

 
 
public class HomeWork2{
	public static void main(String[] args){
		//create objects of the plant class for two fifferent plant
		Plant mangoTree = new Plant("Mango Tree");
		Plant fern = new Plant("Fern");
		
		// Test the implementation for each object
		System.out.println("Plant Name: " + mangoTree.getPlantName());
		mangoTree.absorbSunlight();
		mangoTree.releaseOxygen();
		
		System.out.println("\nPlant Name " + fern.getPlantName());
		fern.absorbSunlight();
		fern.releaseOxygen();
	}
}

/* Output :

Plant Name: Mango Tree
plant is absorbing sunlight for photosynthesis.
Plant is releasing oxygen through respiration.

Plant Name Fern
plant is absorbing sunlight for photosynthesis.
Plant is releasing oxygen through respiration.

*/