//A better Stack Class
class Stack{
	private int stck[];
	private int tos;
	
	//allocate and initialize stack ( a constructor)
	Stack(int size){
		stck = new int[size];
		tos = -1;
	}
	
	// Push an item onto the stack
	void push(int item){
		if(tos==stck.length-1) //use stack length member variable
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	// Pop an item off of the stack
	int pop(){
		if(tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
	
}

