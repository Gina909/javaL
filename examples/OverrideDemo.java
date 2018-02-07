//Method override demo

class OverrideDemo{
	public static void main(String args []){
		A objA = new A(3, 4);
		B objB = new B(3,4, "hello from B");
		objA.show();
		objB.show();
	}
}