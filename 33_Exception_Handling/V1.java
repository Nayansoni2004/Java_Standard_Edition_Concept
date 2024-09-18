import java.io.FileNotFoundException;
import java.io.IOException;

class V1 {
    //main method 
    public static void main(String[] args) {

        try {
            throw new FileNotFoundException();
        } 
        //catch(IOException e) { } 
        
        catch(FileNotFoundException e) { }

    }
}
/*OUTPUT: happily compiled & runned kyuki IOException jo ki parent h FileNotFoundException ka avi commented h,
          agar uncomment kr denge to ye error aayegi...

D:\javaprac\33_Exception_Handling>javac V1.java
V1.java:13: error: exception FileNotFoundException has already been caught
        catch(FileNotFoundException e) { }
        ^
1 error
 */