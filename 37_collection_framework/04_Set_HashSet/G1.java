import java.util.HashSet;
import java.util.Iterator;
class G1 {
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

        Iterator itr = set.iterator();
        while(itr.hasNext()) {//refined implementation,bec. rather than using for loop to iterate,we used while loop.
            String str = (String)itr.next();

            System.out.println(str.length());/*kyuki length() Object class m nhi h,lekin String class m h isley 
                                               call kr pa rhe h,or isley v kyuki String var. str pe kr rhe h.*/
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
6
 */