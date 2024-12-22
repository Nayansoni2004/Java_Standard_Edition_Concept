//Concept:is example m hum TreeSet ko iterate kr rhe h,Enhanced forloop ka use kr k. 
import java.util.TreeSet;
class D {
    //main method
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);
        set.add(38);
        set.add(9);
        //Enhanced for loop.
        for(Object yam : set) {
            System.out.println(yam);
        }
    }
}
/*OUTPUT: assending order m aaya kyuki, TreeSet ordered or sorted collection class h.
4
9
19
23
38
41
56 */