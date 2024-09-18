import java.io.FileReader;
import java.io.FileNotFoundException; 

class J {
    J() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
    }

    //main method
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("A");

        J x = new J();

        System.out.println("B");
    }
}
/*OUTPUT:
D:\javaprac\33_Exception_Handling>javac J.java

D:\javaprac\33_Exception_Handling>java J
A
B
*/