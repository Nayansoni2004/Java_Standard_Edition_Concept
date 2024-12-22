//CONCEPT: HashSet m bhi heterogeneous records rakh sakte h.
import java.util.HashSet;
class I {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add(12);
        set.add(true);
        set.add(4.56);

        System.out.println(set);
    }
}
//OUTPUT: [mohan, 4.56, 12, true]