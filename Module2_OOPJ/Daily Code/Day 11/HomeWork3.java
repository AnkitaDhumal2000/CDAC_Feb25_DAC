/* Java Coding Question (20 Marks)
Implement Runtime Polymorphism in Java using a BMW vehicle hierarchy. Create a parent class BMW with two methods: showDetails(), which prints "This is a BMW vehicle.", and maxSpeed(), which prints "Speed varies by model.".

Extend this class into three subclasses: BMWSeries3, BMWSeries5, and BMWSeries7, each overriding the methods to display their respective series names and max speeds (240 km/h, 260 km/h, and 300 km/h).

In the main method, create an array of BMW references, assign subclass objects, and use a loop to call showDetails() and maxSpeed(). The program should demonstrate method overriding, runtime polymorphism, and dynamic method dispatch.

*/

class BMW{
  //method to show details
  public void showDetails(){
         System.out.println("This is a BMW vehicle.");
		}
		
		//Method to display max speeds
		public void maxSpeed(){
		System.out.println("Speed varies by ,odel.");
		}
	}

class BMWSeries3 extends BMW{
    //Override showDetails method
	@Override
	public void showDetails(){
	    System.out.println("This is a Series 3 vehicle.");
		}
		
	//Override maxSpeed method
	@Override
	public void maxSpeed(){
	      System.out.println("Max Speed: 240 km/h");
		}
	}
	
//Subclass BMWSeries5class 
class BMWSeries5 extends BMW{
  //Override showDetailsmethod
  @Override
  public void maxSpeed(){
        System.out.println("Max speed: 260 km/h");
		}
}

//Subclass BMWSeries7
class BMWSeries7 extends BMW {
//Override showDetails method
   @Override   
   public void showDetails(){
         System.out.println("this is a BMW Series 7 vehicle.");
		}
		
		//Override maxSpeed method
		@Override 
		public void maxSpeed(){
		      System.out.println("Max seed:300 km/h");
		}
}

public class HomeWork3{
     public static void main(String []args){
	 //create an array of BMW references
	 BMW[] bmwVehicles = new BMW[3];
	 
	 //Assign subclass objects to the array
	 bmwVehicles[0] = new BMWSeries3();
	 bmwVehicles[1] = new BMWSeries5();
	 bmwVehicles[2] = new BMWSeries7();
	 
	 //use a loop to call showDetails() and maxSpeed()
	     for (BMW vehicle : bmwVehicles){
	         vehicle.showDetails();
	         vehicle.maxSpeed();
	         System.out.println(); // Empty Line better readability
	        }
		}
	}
	
/*Output :-

This is a Series 3 vehicle.
Max Speed: 240 km/h

This is a BMW vehicle.
Max speed: 260 km/h

this is a BMW Series 7 vehicle.
Max seed:300 km/h

*/