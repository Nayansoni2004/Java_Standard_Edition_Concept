/*Concept: set() kewal existing element ko replace krta h,agar element us index k acc. exists nhi krta h to
           IndexOutOfBoundsException generate hoga.*/
import java.util.ArrayList;
class I {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(2.34); //index-0
        x.add(8.45); //index-1
        x.add(7.21); //index-2
        x.add(9.01); //index-3

        System.out.println(x);

        //x.add(4 , 5.55);
        x.set(4 , 5.55);//set()method ko index do, to element replace kr deta,existing element se.

        System.out.println(x);
    }
}
/*OUTPUT:
D:\javaprac\37_collections>java I
[2.34, 8.45, 7.21, 9.01]
[2.34, 8.45, 7.21, 9.01, 5.55] */

/*OUTPUT:
D:\javaprac\37_collections>java I
[2.34, 8.45, 7.21, 9.01]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        at java.base/java.util.Objects.checkIndex(Objects.java:359)
        at java.base/java.util.ArrayList.set(ArrayList.java:441)
        at I.main(I.java:15) */