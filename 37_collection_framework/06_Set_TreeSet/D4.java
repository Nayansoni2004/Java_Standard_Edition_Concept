import java.util.TreeSet;
import java.util.Iterator;
class D4 {
    //main method
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");

        Iterator itr = set.iterator();
        while(itr.hasNext()) {//<-returns true if the iteration has more elements.
            String str = (String)itr.next(); //type-cast.
            System.out.println(str.length());//next()<-returns the next element in the iteration,return type E<Element>.
        }//length()<-ye method String class ki h kyuki String class k obj. str pr call ho rhi h.
    }
}
/*OUTPUT:TreeSet k records ki length print hui,assending order m sorted hoke,kyuki TreeSet is Ordered & sorted
         collection class.
5 <-"bablu" ki length.
6 <-"ganesh" ki length. 
3 <-"jay" ki length.
5 <-"mohan" ki length.
5 <-"rohan" ki length. */