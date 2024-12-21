import java.util.ArrayList;
class M {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //index-0
        x.add(2.34); //index-1
        x.add(74); //index-2
        x.add(true); //index-3
        x.add('Y'); //index-4

        System.out.println(x);
    }
}
/*OUTPUT:java internally toString()method Object alpha class ki call krega or ye method String value return kregi.
[mohan, 2.34, 74, true, Y]
 */