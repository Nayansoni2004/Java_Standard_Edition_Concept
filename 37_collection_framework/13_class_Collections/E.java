import java.util.Collections;
import java.util.ArrayList;
class E {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(18);
        list.add(48);
        list.add(67);
        list.add(23);
        list.add(59);

        System.out.println(list);

        //Integer x = Integer.valueOf(48);//2 aayega bahle hi list sort nhi h kyuki 42 index 2 pr hi rakha h.
        //Integer x = Integer.valueOf(23);//-1 kyuki 23 index 4 pr rakha h,pr pahle list sort krna padegi.
        Integer x = Integer.valueOf(78);//-7 aaya bec. before performing binary search u have to sort the list.

        System.out.println(Collections.binarySearch(list , x));
    }
}
/*OUTPUT:list pr binary search krne se pahle list sort krna padti h. 
D:\javaprac\37_collection_framework\13_class_Collections>java E
[78, 18, 48, 67, 23, 59]
2 

D:\javaprac\37_collection_framework\13_class_Collections>java E
[78, 18, 48, 67, 23, 59]
-1

D:\javaprac\37_collection_framework\13_class_Collections>java E
[78, 18, 48, 67, 23, 59]
-7 */