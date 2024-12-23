import java.util.TreeMap;
class B {
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

        //System.out.println(map.floorKey(28));
        //System.out.println(map.floorKey(52));
        System.out.println(map.floorKey(2));
    }
}
//OUTPUT:28
//OUTPUT:35
//OUTPUT:null