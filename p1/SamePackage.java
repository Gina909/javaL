//Learning Access Control

package p1;

class SamePackage extends Protection{
	SamePackage(){
		
		Protection p = new Protection();
		
		System.out.println("SamePackage Constructor");
		System.out.println("n in SamePackage = " + p.n);
		
		System.out.println("n_pri is not accessible from class  SamePackage" );
		System.out.println("n_pro in class SamePackage = " + n_pro);
		System.out.println("n_pub in class SamePackage = " + n_pub);
	}
}

