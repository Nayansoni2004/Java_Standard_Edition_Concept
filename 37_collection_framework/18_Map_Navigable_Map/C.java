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

        //System.out.println(map.ceilingEntry(39));
        //System.out.println(map.ceilingEntry(28));
        System.out.println(map.ceilingEntry(90));
    }
}
//OUTPUT:55=gopal
//OUTPUT:28=mohan
//OUTPUT:null