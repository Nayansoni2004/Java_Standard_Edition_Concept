/*Concept: new element add() ya set() krne pr bydefault ArrayList k last m operation perform hota h,agar aisa 
           index provide krenge jo exists nhi krta h,to IndexOutOfBoundsException generate hoga. */
import java.util.ArrayList;
class I1 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(2.34); //index-0
        x.add(8.45); //index-1
        x.add(7.21); //index-2
        x.add(9.01); //index-3

        System.out.println(x);

        x.add(20 , 5.55); //indexing + element dono dena h,kyuki ye list interface ki add()method h.
       // x.set(20 , 5.55);//set()method ko index do, to element replace kr deta,existing element se.


        System.out.println(x);
    }
}
/*OUTPUT: add() method wala output....
D:\javaprac\37_collections>java I1
[2.34, 8.45, 7.21, 9.01]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 20, Size: 4
        at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
        at java.base/java.util.ArrayList.add(ArrayList.java:481)
        at I1.main(I1.java:14) */

/*OUTPUT: set() method wala output...
D:\javaprac\37_collections>java I1
[2.34, 8.45, 7.21, 9.01]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 4
        at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        at java.base/java.util.Objects.checkIndex(Objects.java:359)
        at java.base/java.util.ArrayList.set(ArrayList.java:441)
        at I1.main(I1.java:15) */        