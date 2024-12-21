import java.util.ArrayList;
class L {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(51); //index-0
        x.add(2); //index-1
        x.add(5); //index-2
        x.add(3); //index-3
        x.add(9); //index-4

        System.out.println(x);

       // System.out.println(x.remove(3));
       System.out.println(x.get(3));//List sub-Interface ka index parameterized get(index)version call hoga,or Object value return krega.

        System.out.println(x);
    }
}
/*OUTPUT:List sub-Interface ka index parameterized remove(index)version call hoga,or Object value return krega.
D:\javaprac\37_collection_ArrayList>java L
[51, 2, 5, 3, 9]
3
[51, 2, 5, 9] */

/*OUTPUT:List sub-interface ka index parameterized get(index)version call hoga,or Object value return krega,but
         kuch remove nhi hoga,kyuki remove kia hi nhi h. 
D:\javaprac\37_collection_ArrayList>java L
[51, 2, 5, 3, 9]
3
[51, 2, 5, 3, 9] */