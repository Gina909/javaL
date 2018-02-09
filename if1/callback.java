//Experimenting with Interfaces
package if1;

interface callback{
	void callback(int param);
}
class Client implements callback{
    //Implement callback's interface
    
    public void callback(int p){
        System.out.println("inside Client class's implementation of callback interface.  Value of int p = " + p);
    }
    
    public void nonIfaceMeth(String s1){
        System.out.println(s1 + "Classes that implement interfaces may also include other methods.");
    }
}

class AnotherClient implements callback{
    public void callback(int p){
        System.out.println("in anotherclient's callback method");
        System.out.println("p squared is:  " + (p*p));
    }
    
    public int nonIfaceMeth2(int x, int y){
        System.out.println("returning results from nonIfaceMeth2:  x * y = " + x*y);
        return x*y;
    }
}

