//implement fixed stack

class IFTest{
    public static void main(String args[]){
        int s = 5, t = 8;
        FixedStack mystack1 = new FixedStack(s);
        FixedStack mystack2 = new FixedStack(t);
        
        //push items on stacks
        
        for(int i = 0; i < s; i++) mystack1.push(i);
        for(int i = 0; i < t; i++) mystack2.push(i);
        
        //show items in the stack
        
        
        System.out.println("mystack1 contains items:");
        for(int i = s; i > 0; i--) System.out.println(mystack1.pop() + ",");
        System.out.println("mystack2 contains items:");
        for(int i = t; i > 0; i--) System.out.println(mystack2.pop() + ",");
    }
}
