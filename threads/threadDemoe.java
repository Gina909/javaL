//extending thread class

class threadDemoe{
    public static void main(String args[]){
         NewThreade  nt = new NewThreade(); //create new thread
        Thread t = Thread.currentThread();
        
        try{
            for(int i = 5;  i > 0; i--){
                System.out.println("in thread:  " +  t.getName() + "class main sleeping " + i);
                t.sleep(1000);
            }//close for
            
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted" + t.getName());
        }//close catch
        
        System.out.println(t.getName() + " exiting.... ");
        
    }//closee main
}//close class

