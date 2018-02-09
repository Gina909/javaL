//use interface methods

package if1;

class TestIface{
    public static void main(String args[]){
        callback c = new Client();
        Client b = new Client();
        AnotherClient a = new AnotherClient();
        int z;
        
        c.callback(42);
        b.callback(11111);
        b.nonIfaceMeth("client b calling...");
        a.callback(5);
        z = a.nonIfaceMeth2(10, 5);
        System.out.println("In TestIface...Anotherclient a called nonIfaceMeth2 and received results:  " + z);
        
        c = a;
        c.callback(42);
    }
}
