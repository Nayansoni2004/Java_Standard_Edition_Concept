/*Concept: add() jagah banata h new element insert krne k liye,or set() existing element ko new element se 
           replace kr deta h.*/
import java.util.ArrayList;
class H2 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(2.34); //index-0
        x.add(8.45); //index-1
        x.add(7.21); //index-2
        x.add(9.01); //index-3

        System.out.println(x);

        //x.add(2 , 5.55); //set()method ko index do, to element replace kr deta,existing element se.
        System.out.println(x.set(2 , 5.55));
        System.out.println(x);
    }
}
/*OUTPUT:
D:\javaprac\37_collections>java H2
[2.34, 8.45, 7.21, 9.01]
[2.34, 8.45, 5.55, 7.21, 9.01] */

/*OUTPUT:
[2.34, 8.45, 7.21, 9.01]
7.21
[2.34, 8.45, 5.55, 9.01] */