import java.util.Collections;
import java.util.ArrayList;
class E1 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(18);
        list.add(48);
        list.add(67);
        list.add(23);
        list.add(59);

        Collections.sort(list);//<-sort kr lia h humne pahle to ab list pe binary search perform kr sakte h.

        System.out.println(list);

        //Integer x = Integer.valueOf(48);
        //Integer x = Integer.valueOf(23);
        Integer x = Integer.valueOf(78);

        System.out.println(Collections.binarySearch(list , x));//<-list or key dono pas krna padta h is method m.
    }
}
/*OUTPUT: list ko sort kr liya h to ab binarySearch perform kr sakte h.
D:\javaprac\37_collection_framework\13_class_Collections>java E1
[18, 23, 48, 59, 67, 78]
2 

D:\javaprac\37_collection_framework\13_class_Collections>java E1
[18, 23, 48, 59, 67, 78]
1

D:\javaprac\37_collection_framework\13_class_Collections>java E1
[18, 23, 48, 59, 67, 78]
5 */