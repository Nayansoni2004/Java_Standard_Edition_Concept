//Concept: remove() method k dono versions use kre h,is Example m collection Interface ka bhi pr List ka bhi.
import java.util.ArrayList;
class J1 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(51); //index-0
        x.add(2); //index-1
        x.add(5); //index-2
        x.add(3); //index-3
        x.add(9); //index-4

        System.out.println(x);
        
        Integer a = Integer.valueOf(2);
       // System.out.println(x.remove(2));//List Interface ki method remove(index)version call hoga,or Object value return krega.
        System.out.println(x.remove(a)); //collection Interface ka remove(Object)version call hoga,or boolean return krega.

        System.out.println(x);
    }
}
/*OUTPUT:List sub-interface ka remove(index) parameterized version call hoga,or Object value return krega.
D:\javaprac\37_collection_ArrayList>java J1
[51, 2, 5, 3, 9]
5
[51, 2, 3, 9] */

/*OUTPUT:Collection Interface ka remove(Object) parameterized varsion call hoga,or boolean return krega.
D:\javaprac\37_collection_ArrayList>java J1
[51, 2, 5, 3, 9]
true
[51, 5, 3, 9] */