//Method Overriding is different from method overloading!!
//An overridden method has the exact same signature as the the method in the superclass.
//An overloaded method has a different signature.
//An overridden method in a subclass hides the method in the superclass.

//Method override example

class A{
	int i, j;
	
	A(int a, int b){      //constructor
		i = a;
		j = b;	
	}
	
	//show i and j
	void show(){
		System.out.println("i and j are:  " + i + "  " + j);
	}
}