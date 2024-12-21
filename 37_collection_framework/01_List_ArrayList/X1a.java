import java.util.ArrayList;
class X1a {
    //main method 
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //index-0 ,internally auto-boxing hogi.
        x.add("ganesh"); //index-1 ,internally auto-boxing hogi.
        x.add("vikram"); //index-2 ,internally auto-boxing hogi.
        x.add("raj"); //index-3 ,internally auto-boxing hogi.
        x.add("swaraj"); //index-4 ,internally auto-boxing hogi.

       // for(String y : x) {
        for(Object y : x) { 
            System.out.println(y.length()); //error aayega kyuki length() method Object class m nhi h.
        }
    }
}
/*OUTPUT: Compilation failed...
X1a.java:15: error: cannot find symbol
            System.out.println(y.length()); //error aayega kyuki length() method Object class m nhi h.
                                ^
  symbol:   method length()
  location: variable y of type Object
Note: X1a.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
 */