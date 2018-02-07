//A simple demo of abstract.  An abstract class defines a superclass that declares the structure of a given abstraction 
//without providing a complete implementation of every method.  The super class defines a generatlized form 
//that will be shared by all of its sub classes leaving it to each subclass to fill in the details.

abstract class A{
	abstract void callme();
	
	//concrete methods are still allowed in abstrract classes

	void callmetoo(){
	
		System.out.println("This is the callmetoo  concrete method in abstract class A");
		}
	}

class B extends A{
	void callme(){
		System.out.println("This is B's callme method.  It is the implementation of super class AA");
	}
}

class AbstractDemo{
	public static void main(String args[]){
		B b = new B();
		b.callme(); //callme in Class B
		b.callmetoo(); //callmetoo in Class A
	}
}
