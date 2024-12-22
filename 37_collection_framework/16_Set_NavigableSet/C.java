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

        //String str = new String("isha");
        String str = new String("kailash");
        
        System.out.println(set.headSet(str , true));
    }
}
//OUTPUT:[balwant, chetan, gajendra]
//OUTPUT:[balwant, chetan, gajendra, ishali, kailash]