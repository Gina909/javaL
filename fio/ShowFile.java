/*
 Display a text file.
 To use this program, specify the name
 of the file that you want to see.
 For example, to see a file called TEST.TXT,
 use the followin gcommand line.
 
 jaa ShowFile TEST.TXT
 
 This variation wraps the the code that open
 s and access the file within a single try block.
 The file is closed by the finally block.
 */

import java.io.*;

class ShowFile{
    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null;  //create file input stream object.
        
        //First, confirm that a filename has been specified
        if(args.length != 1){
            System.out.println("Usage error:  ShowFile filename");
            return;
        }//close if
        
        //the following code opens a fiole, reads characters until EOF
        //is encountered, and then closes the file via a finally block.
        try{
            fin = new FileInputStream(args[0]);
            
            do{
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            }while (i != -1); //close do-while
        }catch(FileNotFoundException e){
            System.out.println("An I/O Error Occurred");
        }catch(IOException e) {
            System.out.println("Error closing file");
        }//close catch
        finally{
            //close file in all cases
            try{
                if(fin != null) fin.close();
            }catch(IOException e) {
                System.out.println("Error closing file");
            }//close catch
        }//close finally
            
    }//close main thread
}//close class ShowFile
