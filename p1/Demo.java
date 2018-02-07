//Demo Access Control

package p1;

//Instantiate the various classes in p1

public class Demo{
	public static void main(String args[]){

		Protection ob1 = new Protection();
		System.out.println("In demo routine.  Just instantiated ob1 = " + ob1);


		Derived ob2 = new Derived();
		System.out.println("in demo routine.  just instantiated ob2 = "  + ob2);

		
		SamePackage ob3 = new SamePackage();
		System.out.println("in demo routine.  just instantiated ob3 = "  + ob3);


		System.out.println("In demo routine.  ob1 = " + ob1);
		System.out.println("in demo routine.  ob2 = "  + ob2);
		System.out.println("in demo routine.  ob3 = " + ob3);

		/*
		System.out.println("in demo routine.  ob4 = " + ob4);
		System.out.println("in demo routine.  ob5 = " + ob5);
		*/
	}
}
