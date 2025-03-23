/* Create a base abstract class called Vehicle which have data members - wheels and speed and a method - print()

Create the following derived classes -

Car that inherits Vehicle and also stores number of passengers.

Truck that inherits Vehicle and also stores the load limit.

In a main function to create an array of vehicles and store N number objects of car & truck in it.

compare the speed of added vehicles in an array and display the details of the fastest vehicle using print() method.
*/

import java.util.Scanner;

abstract class Vehicle {
      protected int wheels;
      protected int speed; 

      public Vehicle(int wheels, int speed){

      this.wheels = wheels;
	  this.speed = speed;
	  }
	 
	  abstract void print();
 }

class Car extends Vehicle {
     private int passengers; 
	 
	 public Car(int wheels,int speed,int passengers){
	 super(wheels,speed);
	 this.passengers = passengers;
	 }
	 
	 @Override
	 void print() {
	        System.out.println("Car - Wheels :" + wheels + ", Speed:" + speed + " Km/h, Passengers: " + passengers);
	 } 
  
 }

class Truck extends Vehicle{
  private int loadLimit;
  
  public Truck(int wheels, int speed, int loadlimit) {
  super(wheels, speed);
  this.loadLimit = loadlimit;
   }
   
   @Override
   void print() {
     	    System.out.println("Car - Wheels :" + wheels + ", Speed:" + speed + " Km/h, Load Limit: " + loadLimit + " Kg ");

   }
  
}

class Practice1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of vehicles: ");
	int n = scanner.nextInt();
	Vehicle[] vehicles = new Vehicle[n];
	
	for (int i = 0; i < n; i++) {
	    System.out.print("Enter Vehicle type (Car/Truck): ");
		String type = scanner.next();
		if (type.equalsIgnoreCase("Car")) {
			System.out.println("Enter Eheels, speed, passengers: ");
			int wheels = scanner.nextInt();
			int speed = scanner.nextInt();
			int passengers = scanner.nextInt();
			vehicles[i] = new Car(wheels, speed, passengers);
		} else if (type.equalsIgnoreCase("Truck")) {
			System.out.print("Enter wheels , speed , load limit: ");
			int wheels = scanner.nextInt();
			int speed = scanner.nextInt();
			int loadLimit = scanner.nextInt();
			vehicles[i] = new Truck(wheels, speed, loadLimit);
		}else {
			System.out.println("Invalid input. Skipping. ");
			i--;
			
      }
}

    Vehicle fastestVehicle = vehicles[0];
	for(int i =1; i < n; i++) {
		if (vehicles[i].speed > fastestVehicle.speed) {
			fastestVehicle = vehicles[i];
		}
	}
	
	System.out.println("Fastest Vehicle Details: ");
	fastestVehicle.print();
	
	scanner.close();
	
    }
	
}

/* OutPut :

Enter the number of vehicles:
1
Enter Vehicle type (Car/Truck): Truck
Enter wheels , speed , load limit: 4 55 78
Fastest Vehicle Details:
Car - Wheels :4, Speed:55 Km/h, Load Limit: 78 Kg

*/