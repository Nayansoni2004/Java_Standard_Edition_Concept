//Concept: is example m hum Enhanced for loop ka use kr k ArrayList m iterate kr rhe h.
import java.util.ArrayList;
class X1 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //index-0 , auto-boxing internally hogi.
        x.add("ganesh"); //index-1 , auto-boxing internally hogi.
        x.add("vikram"); //index-2 , auto-boxing internally hogi.
        x.add("raj"); //index-3 , auto-boxing internally hogi.
        x.add("swaraj"); //index-4 , auto-boxing internally hogi.

       // for(String y : x) {
        for(Object y : x) { 
            System.out.println(y + "~~");
        }
    } 
}
/*OUTPUT: compilation failed,kyuki object mil rha h or wo automatic String m convert nhi hoga.
D:\javaprac\37_collection_ArrayList>javac X1.java
X1.java:13: error: incompatible types: Object cannot be converted to String
        for(String y : x) {
                       ^
Note: X1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error */

/*OUTPUT:
mohan~~
ganesh~~
vikram~~
raj~~
swaraj~~  */