import java.util.TreeMap;
class D {
    //main method
    public static void main(String[] args) {
        TreeMap<Integer , String> map = new TreeMap<Integer , String>();

        map.put(89 , "ram");
        map.put(28 , "mohan");
        map.put(64 , "farahan");
        map.put(19 , "sateesh");
        map.put(55 , "gopal");
        map.put(9 , "jay");
        map.put(35 , "dinesh");

        //System.out.println(map.headMap(19 , true));
        System.out.println(map.headMap(52 , true));
    }
}
//OUTPUT:{9=jay, 19=sateesh}
//OUTPUT:{9=jay, 19=sateesh, 28=mohan, 35=dinesh}