//Concept: is example m hum ArrayList m iterate kr rhe h.
import java.util.ArrayList;
class X {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //index-0, auto-boxing internally hogi.
        x.add("ganesh"); //index-1, auto-boxing internally hogi.
        x.add("vikram"); //index-2, auto-boxing internally hogi.
        x.add("raj"); //index-3, auto-boxing internally hogi.
        x.add("swaraj"); //index-4, auto-boxing internally hogi.

        for(int i = 0 ; i < x.size() ; i++) {
           // System.out.println(x[i]); <-aise Array ka element read krte h,ArrayList ka nhi.
           System.out.println(x.get(i)); //List class ki method h, get(int index) parameterized h.
        }
    }
}
/*OUTPUT: x[i] array m likhte h element read krne k liye,Array list m to get() method call krna padti h.
D:\javaprac\37_collection_ArrayList>javac X.java
X.java:14: error: array required, but ArrayList found
            System.out.println(x[i]);
                                ^
Note: X.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error */

/*OUTPUT: get(int index) method ka Output...
mohan
ganesh
vikram
raj
swaraj */
