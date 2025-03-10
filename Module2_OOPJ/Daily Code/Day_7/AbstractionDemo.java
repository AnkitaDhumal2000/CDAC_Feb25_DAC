abstract class Shape{  // abstract class
    abstract void draw(); //absract method

}


class Circle extends Shape{  // class which extends abstract class
	void draw(){//abstract method which is nowimplemented
		
		System.out.println("Draw: Circle");
	}
}

class Rectangle extends Shape{
	void draw(){
		
		System.out.println("Draw: Rectangle");
	}

}


class AbstractionDemo{
	public static void main(String args[]){
		Shape s1 = new Circle();  //reference ciircle referencing shape
		s1.draw();
	
	    Shape s2 = new Rectangle();
	    s2.draw();
		
		Rectangle s3 = new Rectangle();
		s2.draw();
	
	}
	
}

/* Output : 
Draw: Circle
Draw: Rectangle
Draw: Rectangle
*/