//Implement both a fixed stack and a dynamic stack object in one program.  This is done
//by creating an interface variable and accessing stacks through it.
/*
 In this porgram, mystack is a reference to the IntStack interface.  Thus, when it refers to ds, it used the versions of push() and pop() defined by the DynStack implementation.  When it refers to fs, it used the versions of push() and pop() defined by FixedStack.  These determinations are made at run time.  Accessing multiple implementations of an interface through an interface reference variable is the most powerful way that java achieves run-time polymorphism.
 */

class IfTest3{
    public static void main(String args[]){
        IntStack mystack;
        DynStack ds  = new DynStack(5);
        FixedStack fs = new FixedStack(12);
        
      
        mystack = ds; //load dynamic stack
        
        for(int i = 0; i < 5; i++)
            mystack.push(i);
        
        System.out.println("Values in dynamic stack ds are:  ");
        for(int i = 0; i < 5; i++)
            System.out.println("within main calling dynstack pop:  " + mystack.pop());
        
        mystack = fs;
        for(int i = 0; i < 12; i++)
            mystack.push(i);
        System.out.println("Values in my fixed stack are:  " );
        for(int i = 0; i < 12; i++)
             System.out.println("within main calling fixed stack pop:  " + mystack.pop());
    }// close main
}// close class IfTest3


