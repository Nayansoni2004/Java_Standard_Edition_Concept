import java.util.TreeMap;
class A {
    //main method
    public static void main(String[] args){
        TreeMap<Integer , String> map = new TreeMap<Integer , String>();

        map.put(89 , "ram");
        map.put(28 , "mohan");
        map.put(64 , "farahan");
        map.put(19 , "sateesh");
        map.put(55 , "gopal");
        map.put(9 , "jay");
        map.put(35 , "dinesh");

        System.out.println(map.firstKey());//<-returns the first(lowest)key currently in this map.
        System.out.println(map.lastKey());//<-returns the last(highest)key currently in this map.
    }
}
//OUTPUT:9
//OUTPUT:89