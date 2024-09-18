import java.io.FileReader;
import java.io.FileNotFoundException;

class D {
    // main method 
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("A");

        FileReader r = new FileReader("abc.txt");

        System.out.println("B");
    }    
}
/*OUTPUT:
A
B
 */