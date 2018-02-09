//implement a dynamic stack

class IfTest2{
    public static void main(String args[]){
        int s = 5, t =8;
        DynStack ob1 = new DynStack(4);
        DynStack ob2 = new DynStack(6);
        
        //push an item onto the stack
        for (int i = 0; i < s;  i++){
            System.out.println("Pushing: " + i  + " onto shorter stack");
            ob1.push(i);
        }// close for
        for(int i = 0; i < t; i++){
            ob2.push(i);
            System.out.println("Pushing: " + i  + " onto larger stack");
        } //close for
        
        
        //show items in stack
        
        System.out.println("DynStack1 contains items:");
        for(int i = s; i > 0; i--) System.out.println(ob1.pop() + ",");
        System.out.println("Dynstack2 contains items:");
        for(int i = t; i > 0; i--) System.out.println(ob2.pop() + ",");
        
    }// close main
}// close class iFTest2
