//Method Overriding is different from method overloading!!
//An overridden method has the exact same signature as the the method in the superclass.
//An overloaded method has a different signature.
//An overridden method in a subclass hides the method in the superclass.

//Method override example

class B extends A{
	String c;
	
	B(int a, int b, String s){      //constructor
		super(a, b);	
		c = s;
	}
	
	//show i and j
	void show(){
		System.out.println("in overridden method show:.  c is " + c);
	}
}