import java.util.ArrayList;
class N1 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("mohan"); //index-0
        x.add(2.34); //index-1
        x.add(74); //index-2
        x.add(true); //index-3
        x.add('Y'); //index-4

        System.out.println(x);

        String str = (String)(x.get(0));
        System.out.println(x.get(0) + " Length is: " + str.length());
    }
}
/*OUTPUT:
[mohan, 2.34, 74, true, Y]
mohan Length is: 5
 */