//non synchronized threads exercise
//these are icky classes.  i dont like them

class Callme{
   synchronized  void call (String msg){
        System.out.print(" in Callme.call with msg:  [" + msg);
        try{
            Thread.sleep(1000);
            //System.out.println("thread awake");
        }catch (InterruptedException e){
            System.out.println("call method of Callme class interrupted");
        }//close catch
        System.out.println("]");
    }//close call method
}//close class Callme

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    
    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        System.out.println("In Caller constructor.  Starting thread");
        t.start();
    }//close Caller constructor
    
    public void run(){
        System.out.println("in run method of Caller thread class");
           // synchronized(target){
        target.call(msg);
      //  }//close synchronized block
    }//close run method
}//close class Caller
