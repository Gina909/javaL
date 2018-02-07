//This program uses inheritance to extend Box.
class Box{
	double width;
	double height;
	double depth;
	
	//construct a clone of an object
	Box(Box ob){
		//pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box(double w, double h, double d){
	//Constructor used when all dimensions are specified.
		width = w;
		height = h;
		depth = d;
	}
	
	//Constructor used when no dimensions specified
	Box(){
	//use negative 1 to indicate an uninitialized box
		width = -1;
		height = -1;
		depth = -1;		
	}
	
	//Constructor used when cube is created.
	Box(double len){
		width = height = depth = len;
	}
	
	//Compute and return volume
	double volume(){
		return width * height * depth;
	}
}

//Here box is extended to include weight

class BoxWeight extends Box{
	double weight; //weight of box
	//Construct clone of object
	
	BoxWeight(BoxWeight ob){
		super(ob);  //call superclass constructor
		weight = ob.weight;
	}
	
	//Constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m){
		super(w,h,d);   //call superclass constructor
		weight = m;
	}
	
	//default constructor
	BoxWeight(){
		super();
		weight = -1;
	}
	
	//constructor for cube
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
	
}

//Here box is extended to include color

class ColorBox extends Box{
	String color;
	
	ColorBox(double w, double h, double d, String c){
		width = w;
		height = h;
		depth = d;
		color = c;
	
	}
}

class Shipment extends BoxWeight{
	double cost;
	
	//construct clone of an object
	Shipment (Shipment ob){
		super(ob);
		cost = ob.cost;
	}
	
	//Construct shipment object with all parameters
	Shipment(double w, double h, double d, double m, double c){
		super(w, h, d, m);
		cost = c;
	}
	
	//Constructor with default values
	Shipment(){
		super();
		cost = -1;
	}
	
}

//Here box is extended to include shipping cost

class DemoBoxWeight{
	public static void main(String args[]){
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		ColorBox mybox3 = new ColorBox(5, 6, 7, "green");
		Shipment Shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment Shipment2 = new Shipment(2, 3, 4, 0.76, 1.26);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is  " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is  " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is  " + vol);
		System.out.println("Color of mybox3 is " + mybox3.color);
		// System.out.println("Color of mybox3 is " + mybox3.color);
		
		vol = Shipment1.volume();
		System.out.println("volume of Shipment1 is "	+  vol);
		System.out.println("Weight of Shipment1 is " + Shipment1.weight);
		System.out.println("Cost of Shipment1 is  $" + Shipment1.cost);
		System.out.println();
		
		vol = Shipment2.volume();
		System.out.println("volume of Shipment2 is "	+  vol);
		System.out.println("Weight of Shipment2 is " + Shipment2.weight);
		System.out.println("Cost of Shipment2 is $" + Shipment2.cost);
		System.out.println();
	}
}
