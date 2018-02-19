//Annotations learning
import java.lang.annotation.*;
import java.lang.reflect.*;

//An annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}//close @interface MyAnno

class Meta{
    //Annotate a method.
    @MyAnno(str = "Annotation Example", val = 100)  //do not close the statement with a semicolon!!
    
    public static void myMeth(){
        Meta ob = new Meta();
        
        //Obtrain the annotation for this method and display the values of the members
        try{
            //First, get a Class object that represents this class.
            Class<?> c = ob.getClass();
            //Now get a Method object that represents this method
            Method m = c.getMethod("myMeth");
            //Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);
            //Finally, display the values
            System.out.println("Displaying values:  " + anno.str() + anno.val());
        }catch(NoSuchMethodException exc){
            System.out.println("Method not found");
        }//close catch
    }//close myMeth method
                               public static void main(String args[]){
                myMeth();
            }//close main
}//close class Meta
