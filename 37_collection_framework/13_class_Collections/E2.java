import java.util.Collections;
import java.util.ArrayList;
class E2 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<Integer>();

        list.add(78);
        list.add(18);
        list.add(48);
        list.add(67);
        list.add(23);
        list.add(56);

        Collections.sort(list);//<-list ko sort kr dia h to ab binarySearch perform kr sakte h.

        System.out.println(list);

        //Integer x = Integer.valueOf(33);
        //Integer x = Integer.valueOf(62);
        Integer x = Integer.valueOf(50);

        System.out.println(Collections.binarySearch(list , x));//list or key(x) dono pas krna padta h binarySearch()method m.
    }
}
/*OUTPUT: agar aisa element pass kr rhe h binarySeach()method m jo ki list m exists nhi krta h,to formula use
          hota h ki jo (non-existing)element pass kr rhe h agar wo list m hota to kis index pe hota,then formula
          use hota h (-(insertion-point)-1)<-search index find krne k liye.
D:\javaprac\37_collection_framework\13_class_Collections>java E2
[18, 23, 48, 56, 67, 78]
-3 

D:\javaprac\37_collection_framework\13_class_Collections>java E2
[18, 23, 48, 56, 67, 78]
-5

D:\javaprac\37_collection_framework\13_class_Collections>java E2
[18, 23, 48, 56, 67, 78]
-4 */