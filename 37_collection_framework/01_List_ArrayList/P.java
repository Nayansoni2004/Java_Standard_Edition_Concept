import java.util.ArrayList;
class P {
    //main method
    public static void main(String[] args) {
       // ArrayList x = new ArrayList(); //warning aayegi bec. record ka type-safe declare nhi kia h.
    ArrayList<Integer> x = new ArrayList<Integer>();//warning nhi aayegi kyuki record ka type-safe declare kia h.

        x.add(34);

        System.out.println(x);
    }
}
/*OUTPUT: //warning aai bec. record ka type-safe declare nhi kia h.
Note: P.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details. */

/*OUTPUT: koi warning nhi aayi is case m kyuki record ka type-safe declare kia h.
D:\javaprac\37_collection_ArrayList>javac P.java

 */