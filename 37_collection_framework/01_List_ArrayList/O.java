import java.util.ArrayList;
class O {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

       // x.add(34);

        System.out.println(x);
    }
}
/*OUTPUT:is examle ko compile krne pr koi warning nhi aai,kyuki koi unsafe operation perform nhi kia,lekin agar
         koi record add() krte to 2 lines ki Warning aati as a note:,kyuki hum record add to kr rhe h,lekin type
         safe declare nhi kr rhe h,ki kis type ka record h.
    Waring: Note: O.java uses unchecked or unsafe operations.
            Note: Recompile with -Xlint:unchecked for details.
[]
 */