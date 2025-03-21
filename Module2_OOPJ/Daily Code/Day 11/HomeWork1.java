/* Ques.1
Create an abstract class Shape that represents different geometric shapes. This class should contain:

A protected attribute shapeName to store the name of the shape.
A constructor that initializes shapeName.
A method getShapeName() that returns the name of the shape.
An abstract method calculateArea() that will be implemented by subclasses.
Next, create two concrete classes, Circle and Rectangle, that extend Shape and implement the calculateArea() method:

The Circle class should have a private attribute radius, a constructor to initialize it, and implement calculateArea() using the formula:
image

The Rectangle class should have private attributes length and width, a constructor to initialize them, and implement calculateArea() using the formula:
image

Finally, write a test program in the main method that:

Creates an object of Circle with a radius of 5.0 and displays the area.
Creates an object of Rectangle with a length of 4.0 and width of 6.0 and displays the area.
Uses polymorphism by referring to objects of Circle and Rectangle using Shape references.
Note: Implement the concepts of abstraction, method overriding, polymorphism, and encapsulation in Java OOP concepts.

*/

// Abstract class Shape
abstract class Shape {
	protected String shapeName;
	
	//constructor to initialize shapeName
	public Shape(String ShapeName){
		this.shapeName= shapeName;
	}
	
	// method to get the shape name
	public String getShapeName(){
		return shapeName;
	}
	
	// Abstract method to calculate area
	public abstract double calculateArea();
	
}

// Concreate class Circle.
class Circle extends Shape {
	private double radius;
	
	// Constructor to initialize radius.
	public Circle(double radius){
		super("Circle");
		this.radius = radius;
	}
	
	// Method to calculate area of circle
	@Override
	public double calculateArea(){
		return Math.PI * Math.pow(radius, 2);
		
	}

}


// Concrete class Rectangle
class Rectangle extends Shape {
	private double length;
	private double width;
	
	//Constructor to initializeLength and width
	public Rectangle(double length, double width){
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

//Method to calculate area of rectangle
    @Override
    public double calculateArea(){
            return length * width;
	}

}	
public class HomeWork1{
       public static void main(String[] args){
		   //create an object of Circle with radius of 5.0 and display the area
		   
		   Circle circle = new Circle(5.0);
		   System.out.println("Shape: " + circle.getShapeName());
		   System.out.println("Area "+circle.calculateArea());
		   
		   //Use Polymorphism  by referring to objects of Circle and Rectangle using Shape References
		   
		   Shape shape1 = new Circle(5.0);
		   Shape shape2 = new Rectangle(4.0,6.0);
		   
		   System.out.println("\nUsing Polymorphism:");
		   System.out.println("Shape:" + shape1.getShapeName());
		   System.out.println("Area: " + shape1.calculateArea());
		   
		   System.out.println("\nShape: " + shape2.getShapeName());
		   System.out.println("Area " + shape2.calculateArea());
		   
		   //Create an object of Rectangle with a length of 4.0 and width of 6.0and display the area
		   Rectangle rectangle = new Rectangle(4.0, 6.0);
		   System.out.println("\nShape: " + rectangle.getShapeName());
		   System.out.println("Area" + rectangle.calculateArea());
		   
		   
		   
	   }
}

/* OutPut :

Shape: null
Area 78.53981633974483

Using Polymorphism:
Shape:null
Area: 78.53981633974483

Shape: null
Area 24.0

Shape: null
Area24.0

*/