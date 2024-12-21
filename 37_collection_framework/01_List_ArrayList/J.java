import java.util.ArrayList;
class J {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(51); //index-0
        x.add(2); //index-1
        x.add(5); //index-2
        x.add(3); //index-3
        x.add(9); //index-4

        System.out.println(x);

        System.out.println(x.remove(2));

        System.out.println(x);
    }
}
/*OUTPUT:
[51, 2, 5, 3, 9]
5
[51, 2, 3, 9]
 */