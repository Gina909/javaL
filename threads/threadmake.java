//thread classes for demo exercises

class NewThread implements Runnable{
    Thread t;
    
    NewThread(){
        //create a new, second thread
        t = new Thread(this, "myThread1");
        System.out.println("Creating new thread called myThread1:  " + t);
        t.start();  //starting thread
    }//close constructor
    
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Running  " + t.getName() + " in for loop.  i = " + i);
                t.sleep(500);
            }// close for
        }catch (InterruptedException e){
            System.out.println("myThread1 interrupted!");
       }//close catch
        
        System.out.println("Exiting myThread1...");
    }// close run
}//close NewThread class
