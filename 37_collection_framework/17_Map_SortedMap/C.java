import java.util.TreeMap;
class C {
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

        //System.out.println(map.tailMap(55));
        System.out.println(map.tailMap(90));
    }
}
//OUTPUT:{55=gopal, 64=farahan, 89=ram}
//OUTPUT:{}