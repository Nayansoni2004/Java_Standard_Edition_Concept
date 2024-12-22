import java.util.TreeSet;
class B {
    //main method
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("kailash"); //5
        set.add("balwant"); //1
        set.add("ritesh"); //8
        set.add("gajendra"); //3
        set.add("narayan"); //7
        set.add("chetan"); //2
        set.add("ishali"); //4
        set.add("manas"); //6

        //String str = new String("gajodhar");
        //String str = new String("manas");
        String str = new String("kaashi");

        System.out.println(set.floor(str));
    }
}
//OUTPUT:gajendra
//OUTPUT:manas
//OUTPUT:ishali