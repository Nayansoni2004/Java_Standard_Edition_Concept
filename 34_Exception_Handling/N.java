import java.io.IOException;
import java.io.FileNotFoundException;

class N {
    public static void pro() throws IOException {
        System.out.println("Hi");
    }

    private int pro(int x) throws FileNotFoundException {
        System.out.println("Hi");

        return 2;
    }
}
/*OUTPUT: happily compiled...method overloading k case m bhi koi rule nhi h,chahe WIDER likho, NARROWER likho,
FEWER likho, NEWER likho koi fark nhi padta sub Allowed h.
 */