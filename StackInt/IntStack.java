//Define an integer stack interface

interface IntStack{
    void push(int item); //store an item
    int pop(); //retrieve an item
}

//An implementation of IntStack that uses fixed storage

class FixedStack implements IntStack{
    private int stck[];
    private int tos;
    
    //allocate and intialize the stack
    
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    //Push an item onto the stack
    public void push(int item){
        if(tos==stck.length-1) //use length member)
            System.out.println("stack is full");
        else
            stck[++tos] = item;
    }
    
    public int pop(){
        if(tos < 0){
            System.out.println("Stack underflow.  Stack is depleted. ha hah");
            return 0;
        }
        else
            return stck[tos--];
    }
}

//implement a growable stack
class DynStack implements IntStack{
    private int dstck[];
    private int dtos;
    private int dsize;
    
    //allocate and initalize the stack
    DynStack(int size){
        dstck = new int[size];
        dsize = size;
        dtos = -1;
        
    }// close initialze object
        
        //push an item onto the stack.  If the stock runs out of space then double the size.
        
        public void push(int item){
            if(dtos == dstck.length-1){
                System.out.println("Stack is full.  item is:  " + item + ".  dtos is "  + dtos + ".  Size is " + dsize + ".  Doubling size.");
                dsize = dsize * 2;
                System.out.println("Size doubled to: " + dsize);
               int tmp[] = new int[dsize];
                System.out.println("size of tmp = " + tmp.length);
                System.out.println("size of dstck = " + dstck.length);
                for(int i = 0; i < dstck.length; i++){
                    System.out.println("i = " + i + ".  dstck[i] = " + dstck[i]);
                    tmp[i] = dstck[i];
                    System.out.println("Assigning dstck[i] to tmp[i].  tmp[i] = " + tmp[i]);
                }
                System.out.println("incrementing dtos to:  " + dtos++);
               tmp[dtos] = item;
               dstck = tmp;
        }// close if
            
            else dstck[++dtos] = item;
    }//close push
        
      public  int pop(){
            if(dtos < 0){
                System.out.println("Stack Underflow");
                return 0;
            } //close if
                else
                    return dstck[dtos--];
            
        } //close pop
} //close class Dystack
