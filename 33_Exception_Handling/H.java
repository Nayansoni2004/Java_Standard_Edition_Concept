import java.io.FileReader;
import java.io.FileNotFoundException;

class H {
    H() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
    }

    //main method
    public static void main(String[] args)/*throws FileNotFoundException*/ {

        System.out.println("A");

        H x = new H();

        System.out.println("B");

    }
}
/*OUTPUT:
H.java:14: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        H x = new H();
              ^
1 error
*/