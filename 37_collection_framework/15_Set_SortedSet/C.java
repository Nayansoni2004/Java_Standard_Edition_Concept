import java.util.TreeSet;
class C {
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

        //String str = new String("yamraj");
        //String str = new String("ishita");
        String str = new String("gajendra");

        System.out.println(set.tailSet(str));
    }
}
//OUTPUT:[]
//OUTPUT:[kailash, manas, narayan, ritesh]
//OUTPUT:[gajendra, ishali, kailash, manas, narayan, ritesh]