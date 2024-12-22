import java.util.HashSet;
import java.util.Iterator;
class G2 {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");
        set.add("surya");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {//refined implementation,bec. rather than using for loop,we used while loop to iterate.
           // String str = (String)itr.next(); //<-no use of this statement.

            System.out.println(itr.next().length());//type-safe declare kia h,isley length() call kr sakte h.
        }
    }
}
/*OUTPUT: String records ki length print ho rhi h.
7
5
5
6
4
6
6 */