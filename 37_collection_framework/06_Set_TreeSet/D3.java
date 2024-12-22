import java.util.TreeSet;
import java.util.Iterator;
class D3 {
    //main method
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");

        Iterator itr = set.iterator();
        while(itr.hasNext()) { //<-returns true if the iteration has more elements.
            System.out.println(itr.next().length());//next()<-returns the next element in the iteration,return type E<Element>.
        } //length()<-return type int & returns the length of the String.
    }
}
/*OUTPUT:
D3.java:16: error: cannot find symbol
            System.out.println(itr.next().length());//next()<-returns the next element in the iteration,return type E<Element>.
                                         ^
  symbol:   method length()
  location: class Object
1 error */