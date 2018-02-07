/*
Abstract classes cannot be used to instantiate objects but they can be used to create object references.
It is possible to create a reference to an abstract class so that it can be used to point to a subclass object.
This version of the program declares area() as abstract inside Figure.  Thus all derived classes must define
(override) area().
*/

//Using abstract methods and classes
abstract class Figure{
		double dim1;
		double dim2;
	
		Figure(double a, double b){
			dim1 = a;
			dim2 = b;
	
		}
		
		abstract double area();

}

class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a, b);
	}
	double area(){
		System.out.println("Rectangle class Area method.  Area of Rectangle is being calculated and returned to the instantiated object.");
		return dim1 * dim2;
	}
}
	
class Triangle extends Figure{
	Triangle(double a, double b){
		super(a, b);
	}

	double area(){
		System.out.println("Trainagle class Area method.  Area of Triangle is being calcluated and returned to the instantiated object.");
		return (dim1 * dim2) / 2;
	
	}
}

class AbstractAreas{
	public static void main(String args[]){
		//Figure f = new figure (10,10);  //illiegal now - Figure is an abstract class

		Rectangle r = new Rectangle(10, 10);
		Triangle t = new Triangle(10, 10);
		Figure figref;  		//this is legal because no object is being created.  It is a reference to a triangle or rectangle.

		figref = r;
		System.out.println("figref area is:  " +  figref.area());
		System.out.println("r area is:  " +  r.area());
		
		figref = t;
		System.out.println("figref area is:  " +   figref.area());
		System.out.println("t area is:  " +  t.area());

	}
}



