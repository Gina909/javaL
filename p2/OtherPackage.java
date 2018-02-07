//Access Control learning continued

package p2;
//import p1.*;

class OtherPackage{
	OtherPackage(){
		p1.Protection p = new p1.Protection();
		System.out.println("In OtherPackage constructor");
		
		System.out.println("n in class Protection is not available from Otherpackage");
		System.out.println("n_pri is not available in this class or package");
		System.out.println("n_pro from OtherPackage is not accessible " );
		System.out.println("n_pub from OtherPackage = " + p.n_pub);
	}
}