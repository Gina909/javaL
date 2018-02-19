//demo of synchronization.
//i do not like this example
class Synch{
    public static void main(String args[]){
        Callme target = new Callme();
        Caller c1 = new Caller(target, "Hello");
        Caller c2 = new Caller(target, "new new new");
        Caller c3 = new Caller(target, "World");
        
        try{
            c1.t.join();
            c2.t.join();
            c3.t.join();
        }catch(InterruptedException e){
            System.out.println("sycnh's main thread interrupted");
        }//close catch
    }//close main thread
}//chose Synch class
