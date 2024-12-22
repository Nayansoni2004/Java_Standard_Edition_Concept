//Concept:is example m hum Iterator Interface ki methods ka use kr k TreeSet k records ko iterate kr rhe h.
import java.util.TreeSet;
import java.util.Iterator;
class D2 {
    //main method
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);
        set.add(38);
        set.add(9);

        Iterator itr = set.iterator(); 
        while(itr.hasNext()) { //<-returns true if the iteration has more elements.
            System.out.println(itr.next());//<-return type E<Element> & returns the next element in the iteration.
        } 
    }
}
/*OUTPUT: assending order m sorted output kyuki TreeSet ordered & sorted collection class h.
4
9
19
23
38
41
56 */