//Learn Threads
//This program will teach me how to control the main thread

class CurrentThreadDemo{
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        
        System.out.println("Current thread:  " + t);
        
        //change the name of the thread
        t.setName("Gina Thread");
        System.out.println("Current Thread renamed to " + t);
        
        try{
            for(int n = 5; n > 0; n--){
                System.out.println(n);
   
                t.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted with error:  " + e);
        }
    }
}
