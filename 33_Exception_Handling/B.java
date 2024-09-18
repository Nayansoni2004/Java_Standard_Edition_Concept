//import java.io.FileNotFoundException;
import java.io.FileReader;

class B {
    //main method
    public static void main(String[] args) /*throws FileNotFoundException*/ {

        FileReader r = new FileReader("abc.txt");

    }
}
/* OUTPUT:
B.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader r = new FileReader("abc.txt");
                       ^
1 error
 */