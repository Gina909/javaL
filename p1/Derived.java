//Learning Access Control

package p1;

class Derived extends Protection{
	Derived(){
		System.out.println("Derived Constructor");
		System.out.println("n = " + n);
		System.out.println("n_pri is not accessible from class  Derived" );
		System.out.println("n_pro in class derived = " + n_pro);
		System.out.println("n_pub in class derived = " + n_pub);
	}
}

