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

