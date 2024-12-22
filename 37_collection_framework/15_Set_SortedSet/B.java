import java.util.TreeSet;
class B {
    //main method
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("kailash"); //4
        set.add("balwant"); //1
        set.add("ritesh");  //6
        set.add("gajendra");//3
        set.add("narayan"); //5
        set.add("chetan");  //2

        //String str = new String("gajendra");
        
        String str = new String("kaashi");

        System.out.println(set.headSet(str));
    }
}
//OUTPUT:[balwant, chetan]

//OUTPUT:[balwant, chetan, gajendra]