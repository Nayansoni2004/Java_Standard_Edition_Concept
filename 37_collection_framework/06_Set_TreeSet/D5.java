/*Concept:is example m hum TreeSet k records ko Iterator Interface ki iterator method ka use kr k iterate kr rhe
          h or records ki length print kr rhe h Iterator Interface ko type-safe declare kr k.*/ 
import java.util.TreeSet;
import java.util.Iterator;
class D5 {
    //main method
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");
        set.add("virendravikram");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) { //<-returns true if the iteration has more elements.
           // String str = (String)itr.next();
            System.out.println(itr.next().length());//next()<-returns the next element in the iteration,return type E<Element>.
        } //<-length()method ka use kr sakte h kyuki Integer<String>type-safe declare kia h.
    }
}
/*OUTPUT:assending order m sorted hoke, TreeSet k records ki length print hui,kyuki TreeSet is ordered & sorted
         collection class.
5 <-"bablu" ki length.
6 <-"ganesh" ki length.
3 <-"jay" ki length.
5 <-"mohan" ki length.
5 <-"rohan" ki length.
14<-"virendravikram" ki length.
*/