import java.io.FileReader;

class E {
    E() {
        FileReader r = new FileReader("abc.txt");
    } 
    //main method
    public static void main(String[] args) {
        System.out.println("A");

        E x = new E();

        System.out.println("B");
    }
}
/*OUTPUT:
E.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader r = new FileReader("abc.txt");
                       ^
1 error
*/