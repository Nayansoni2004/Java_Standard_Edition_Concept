import java.util.TreeSet;
class B {
    //main method
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
/*OUTPUT: assending order m sorted hoke print hoga TreeSet,kyuki TreeSet ordered or Sorted collection class h.
[4, 19, 23, 41, 56]
false
5 */