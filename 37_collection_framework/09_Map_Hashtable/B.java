import java.util.Hashtable;
class B {
    //main method
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put("mohan" , 78);
        map.put(null , 54);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put(null , 12);

        System.out.println(map);
    }
}
/*OUTPUT: acc. to property neither key nor value can be null in Hashtable,agar null kia to runtime exception
          NullPointerException aata h.
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
        at java.base/java.util.Hashtable.put(Hashtable.java:481)
        at B.main(B.java:8) */