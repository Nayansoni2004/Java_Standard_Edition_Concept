import java.io.FileReader;
import java.io.FileNotFoundException;

class L1 {
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

    static void bbb() throws FileNotFoundException {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }

    static void ccc() throws FileNotFoundException {
        
        FileReader r = new FileReader("abc.txt");

        System.out.println("R");
    }
}
/*OUTPUT: line no. 14 pe error aai...
D:\javaprac\33_Exception_Handling>javac L1.java
L1.java:14: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        bbb();
           ^
1 error
 */