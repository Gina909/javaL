//Use class generate divisor.
package chap10;
import java.util.Random;

class DemoGenDivisor{
    public static void main(String args[]){
        Random randa = new Random();
        int  p,q, res= 0;
        
        System.out.println("Starting DemoGenDivisor" + '\n');
        
        GenDivisor g = new GenDivisor();
        
        for(int i = 0; i < 5; i++){
            p = (int) (100* randa.nextDouble());
            q = (int) (100* randa.nextDouble());
            System.out.println("sending p and q:  " +  p  + "   " + q + "  to GenDivisor");
            res = g.GenDivisor(p, q);
            System.out.println("res = " + res + " g.a is " + g.a  + " g.b is: " + g.b);
            res = g.GenResult(res);
            if(res == -2 | res == -1){
                System.out.println("final result res  =  divide by zero error.  resetting result to 0");
                res = 0;
            }
                else
                System.out.println("final result res = " + res);
            
            System.out.println("*****" + '\n');

        }
        System.out.println('\n' + "goodbye");
    }
}
