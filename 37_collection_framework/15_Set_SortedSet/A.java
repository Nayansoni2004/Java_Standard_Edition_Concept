import java.util.TreeSet;
class A {
    //main method
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("kailash");
        set.add("balwant");
        set.add("ritesh");
        set.add("gajendra");
        set.add("narayan");
        set.add("chetan");

        System.out.println(set.first());//<-returns the first(lowest) element currently in the set.

        System.out.println(set.last());//<-returns the last(highest) element currently in the set.
    }
}
//OUTPUT:balwant

//OUTPUT:ritesh