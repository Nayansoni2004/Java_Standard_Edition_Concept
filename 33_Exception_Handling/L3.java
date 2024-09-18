import java.io.FileReader;
import java.io.FileNotFoundException;

class L3 {
    //main method
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("T");
        aaa();
        System.out.println("H");
    }

    static void aaa() throws FileNotFoundException {
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
/*OUTPUT: kyuki abc.txt file exists krti h isley T S K k baad exception nhi aaya or process bas isley nhi ruki...
kyuki exception ko either handle or declare krna padta h, or hum ne throws keyword ki help se declare kia h.
D:\javaprac\33_Exception_Handling>javac L3.java

D:\javaprac\33_Exception_Handling>java L3
T
S
K
R
Q
J
H
 */