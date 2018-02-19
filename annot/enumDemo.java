//Demo enumeration class use of ordinal(), compareto(), and equals()

//Enumeration of apple varieties

enum Apple{
    Jonagold, WineSap, Snapdragon, Gala, Fuji
}//close enum

class EnumDemo{
    public static void main (String args[]){
        Apple ap1, ap2, ap3;
        
        //Obtain all ordinal values of apple
        System.out.println("Here are all of the apple constants and their ordinal values:  ");
        for(Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal() + '\n');
        
        ap1 = Apple.Jonagold;
        ap2 = Apple.Snapdragon;
        ap3 = Apple.Gala;
        
        //Demonstrate compareto()
        
        if (ap1.compareTo(ap2) < 0)
            System.out.println(ap1 + " comes before " + ap2);
        if(ap1.compareTo(ap3) > 0)
            System.out.println((ap1 + " comes after " + ap3));
        if(ap1.compareTo(ap3) == 0)
            System.out.println((ap1 + " is equal to " + ap3 + '\n'));
        
        if(ap1.equals(ap2))
            System.out.println("Error");
        if(ap1.equals(ap3))
            System.out.println(ap1 + " equals " + ap3);
        
        System.out.println("goodbye");
    }//close main thread
}//close EnumDemo class

