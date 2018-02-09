//Use SharedConstants interface

class SharedConstantDemo{
    public static void main(String args[]){
        AskMe am = new AskMe();
        Question q = new Question();
        int a;
        
        for(int i = 0; i<5; i++){
            a = q.ask();
            am.answer(a);
        }
    }
}
