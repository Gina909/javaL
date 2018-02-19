//create thread by extending thread class

class MultiThread extends Thread{
    
    MultiThread(String tname){
        //Create a new second thread by invoking Thread constructor
        super(tname);
        
        System.out.println("creating thread:  " + this.getName() + "with priority:  " + this.getPriority() + " inside class MultiThread");
        this.start();
    }//close constructor
    
    //this is the entry point for the thread
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("in run method of " + this.getName() + "i = " + i);
                this.sleep(500);
            }//close for
        }catch(InterruptedException e){
            System.out.println(this.getName() + " has been interrupted!!!");
        }//close catch
        
        System.out.println("exiting run method for thread " + this.getName());
    }// close run method
}//close class MultiThread
