//Try to use main in a separate file
class TestStack2{
	public static void main(String args[]){
		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(8);
		
		// push some members onto the stack
		
		for(int i = 0; i < 5; i++) mystack1.push(i);
		for(int i = 0; i <8; i++) mystack2.push(i);
		
		//pop those members off
		
		System.out.println("Stack in mystack1: ");
		for(int i = 0; i < 5; i++) System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2: ");		
		for(int i = 0; i < 8; i++) System.out.println(mystack2.pop());
	}
}