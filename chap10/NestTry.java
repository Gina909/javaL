/*
 Try Statements can be implicitly nested via calls to methods.  To call this program you
 must supply command line arguments.  Ex>  java NestTry one two three
 */

class NestTry{
    static void NestTry(int a){
        try{
            /*
             Nested try block.
             If one commind line arg is used,
             then divide by 0 exception will be generated by
             the following code.
             */
            if(a == 1) a = a/(a-a);  //division by zero
            
            /*
             If 2 command-line args are used the following
             statement will generate an array out of bounds
             exception.
             */
            if (a ==2){
                int c[] = {1};
                c[42] = 99; //generate an out of bounds exception.
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds:  "  + e);
        }
    }
    
    public static void main(String args[]){
        try{
            int a = args.length;
            /*
             If no command line args are present then
             the following statement will generate a
             divide by 0 exception.
             */
            int b = 42/a;
            System.out.println("a = " +  a);
            NestTry(a);
        }catch(ArithmeticException e){
            System.out.println("Divide by 0");
        }
    }
}

