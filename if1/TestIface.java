//use interface methods

package if1;

class TestIface{
    public static void main(String args[]){
        callback c = new Client();
        Client b = new Client();
        
        c.callback(42);
        b.callback(11111);
        b.nonIfaceMeth("client b calling...");
    }
}
