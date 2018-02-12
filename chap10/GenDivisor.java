//Learn about exception handling in java
package chap10;

class GenDivisor{
    static int i = 12345;
    static int r1 = -1;
    static int r2 = -2;
    int result, a, b;
    
    int GenDivisor(int h, int j){
        a = h;
        b = j;
        System.out.println("a is " + a + " b is " + b);
        try{
            System.out.println("a/b is " + a/b);
            return (a/b);
        }catch (ArithmeticException e1){
            System.out.println("Generate Divisor - divide by 0 error");
        }//close catch
        System.out.println("gracefully exiting class GenDivisor with exit error r1");
        return r1;

    }
    int GenResult(int  d){
        try{
            System.out.println(" i = " + i);
            result = i/d;
            System.out.println("i/d = " + i/d + "  result is:  "  + result);
            return result;
        }catch (ArithmeticException e2){
            System.out.println("Generate Result - divide by 0 error");
        }//close catch
        System.out.println("gracefully exiting class GenDivisor with exit error r2");
        return r2;
        
    }
}
