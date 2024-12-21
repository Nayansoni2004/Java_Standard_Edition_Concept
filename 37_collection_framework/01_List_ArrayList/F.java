//Concept: Duplicate records are allowed in ArrayList.
import java.util.ArrayList;
class F {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("mohan"); //bec. duplicate records are allowed in ArrayList.
        x.add("gohan");
        x.add("tohan");
        x.add("mohan");

        System.out.println(x);
    }
}
//OUTPUT: [mohan, sohan, rohan, mohan, gohan, tohan, mohan]
 