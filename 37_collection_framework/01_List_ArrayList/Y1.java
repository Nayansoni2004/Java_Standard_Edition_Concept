//Concept:re-indexing is done while removing element one/by/one from an ArrayList,but Size fix kr dia h.
import java.util.ArrayList;
class Y1 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //re-indexing, internally auto-boxing hogi.
        x.add("ganesh"); //re-indexing, internally auto-boxing hogi.
        x.add("vikram"); //re-indexing, internally auto-boxing hogi.
        x.add("raj"); //re-indexing, internally auto-boxing hogi.
        x.add("swaraj"); //re-indexing, internally auto-boxing hogi.

        System.out.println(x); //internally toString() object class ki method call hogi,print hone se pahle.

        int size = x.size();
        for(int i = 0 ; i < size ; i++) {
            System.out.println(x.remove(i));
        }

        System.out.println(x);//isme internally toString() call nhi hoga,kyuki koi record hi nhi h convert krne.
    }
}
/*OUTPUT: kyuki size fix kr dia h to loop chalega jub tak i ki value 5 na ho jaye,isley exception aaya kyuki index
          3 rha hi nhi or remove()method 3 index wale element ko remove krne ki kosis kr rha h.
[mohan, ganesh, vikram, raj, swaraj]
mohan
vikram
swaraj
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
        at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        at java.base/java.util.Objects.checkIndex(Objects.java:359)
        at java.base/java.util.ArrayList.remove(ArrayList.java:504)
        at Y1.main(Y1.java:18) */