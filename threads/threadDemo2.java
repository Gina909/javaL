//Next thread exercise

class threadDemo2{
    public static void main(String args[]){
        new NewThread(); //create thread
        
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("In main thread for loop.  i = " + i);
                Thread.sleep(1000);
            }//close for
        }catch (InterruptedException e){
            System.out.println("main thread interrupted!");
        }//close catch
        
        System.out.println("closing main thread....");
    }//close main thread
}//close threadDemo2 class
