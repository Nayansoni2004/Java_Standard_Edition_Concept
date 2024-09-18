import java.io.FileReader;
import java.io.FileNotFoundException;

class L {
    //main method
    public static void main(String[] args) {
        System.out.println("T");
        aaa();
        System.out.println("H");
    }

    static void aaa() {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }

    static void bbb() {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }

    static void ccc() throws FileNotFoundException {

        FileReader r = new FileReader("abc.txt");

        System.out.println("R");
    }
}
/*OUTPUT: line no. 20 pe error aai h....
L.java:20: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        ccc();
           ^
1 error
 */