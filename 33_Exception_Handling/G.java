import java.io.FileReader;
import java.io.FileNotFoundException;

class G {
    G() {

        FileReader r = new FileReader("abc.txt");

    }
}
/*OUTPUT: either handle of declare the exception...
G.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader r = new FileReader("abc.txt");
                       ^
1 error
*/