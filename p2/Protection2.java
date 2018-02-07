//Access Control learning continued

package p2;
//import p1.*;

class Protection2 extends p1.Protection{
	Protection2(){
		System.out.println("In constructor for Protection2 , the other derived package");
		System.out.println("n from Protection is not available in p2.Protection2.");
		System.out.println("n_pro from p2.Protection2 = " + n_pro);
		System.out.println("n_pub from p2.Protection2 = " + n_pub);
	}
}