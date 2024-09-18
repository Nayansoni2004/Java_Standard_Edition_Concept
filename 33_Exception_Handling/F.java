import java.io.FileReader;
import java.io.FileNotFoundException;

class F {
    F() {
        try {
            FileReader r = new FileReader("abc.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //main method
    public static void main(String[] args) {

        System.out.println("A");

        F x = new F();

        System.out.println("B");
    }
}
/*OUTPUT: agar file abc exists nhi krti h to ye output aayega...
D:\javaprac\33_Exception_Handling>java F
A
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        at java.base/java.io.FileReader.<init>(FileReader.java:60)
        at F.<init>(F.java:7)
        at F.main(F.java:18)
B
*/
/*OUTPUT: agar file Exists krti h to ye output aayega....
D:\javaprac\33_Exception_Handling>java F
A
B
*/