import java.util.TreeSet;
class C {
    //main method
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);

        System.out.println(set);
       // System.out.println(set.contains(41));
        System.out.println(set.remove(41));
        System.out.println(set);
    }
}
/*OUTPUT: contains()method ka output.
[4, 19, 23, 41, 56]
true
[4, 19, 23, 41, 56] */

/*OUTPUT: remove()method ka output.
[4, 19, 23, 41, 56]
true
[4, 19, 23, 56] */