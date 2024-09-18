import java.io.FileReader;
import java.io.FileNotFoundException;

class M {
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

        try {
            ccc();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Q");
    }

    static void ccc() throws FileNotFoundException {
        
        FileReader r = new FileReader("abc.txt");

        System.out.println("R");
    }
}
/*OUTPUT: agar abc.txt file exists krti h to ye output aayega
D:\javaprac\33_Exception_Handling>java M
T
S
K
R
Q
J
H
 */
/*OUTPUT: agar abc.txt file exists nhi krti h to ye OUTPUT aayega...
D:\javaprac\33_Exception_Handling>java M
T
S
K
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        at java.base/java.io.FileReader.<init>(FileReader.java:60)
        at M.ccc(M.java:32)
        at M.bbb(M.java:22)
        at M.aaa(M.java:14)
        at M.main(M.java:8)
Q
J
H
 */