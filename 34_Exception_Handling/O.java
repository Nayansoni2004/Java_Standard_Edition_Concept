import java.io.FileNotFoundException;
import java.io.EOFException;

class O {
    public static void pro() throws FileNotFoundException {
        System.out.println("Hi");
    }    

    private int pro(int x) throws EOFException {
        System.out.println("Hi");

        return 2;
    }
}
/*OUTPUT:happily compiled...method overloading k case m koi rule nhi h, chahe WIDER likho, FEWER likho, NARROWER
likho, NEWER likho koi fark nhi padta,sub allow h.
 */