import java.util.ArrayList;
class H {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(2.34);  //index-0
        x.add(8.45);  //index-1
        x.add(7.21);  //index-2
        x.add(9.01);  //index-3

        System.out.println(x);

        x.add(2 , 5.55); //add()method ka index wala version jo List interface m h,wo call kia h.

        System.out.println(x);
    }
}
/*OUTPUT:
[2.34, 8.45, 7.21, 9.01]
[2.34, 8.45, 5.55, 7.21, 9.01]
 */