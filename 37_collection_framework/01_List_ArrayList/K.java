import java.util.ArrayList;
class K {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(51); //index-0
        x.add(2); //index-1
        x.add(5); //index-2
        x.add(3); //index-3
        x.add(9); //index-4

        System.out.println(x);

        System.out.println(x.remove(9));//List sub-Interface ka index parameterized remove(index)version call hoga.

        System.out.println(x);
    }
}
/*OUTPUT:
D:\javaprac\37_collection_ArrayList>java K
[51, 2, 5, 3, 9]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 5
        at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        at java.base/java.util.Objects.checkIndex(Objects.java:359)
        at java.base/java.util.ArrayList.remove(ArrayList.java:504)
        at K.main(K.java:15)
 */