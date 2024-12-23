import java.util.TreeMap;
class A {
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

        //System.out.println(map.ceilingKey(20));
        //System.out.println(map.ceilingKey(35));
        System.out.println(map.ceilingKey(99));
    }
}
//OUTPUT:28
//OUTPUT:35
//OUTPUT:null