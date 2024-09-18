import java.io.FileReader;
import java.io.FileNotFoundException;

class C {
    //main method
    public static void main(String[] args) {
        System.out.println("A");

        try {
            FileReader r = new FileReader("abc.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("B");
    }
}
/*OUTPUT:
A
B
*/