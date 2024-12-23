import java.util.Hashtable;
class A {
    //main method
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , null);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , null);

        System.out.println(map);
    }
} 
/*OUTPUT: acc. to property neither key nor value can be null in Hashtable,agar null kia to runtime exception
          NullPointerException aata h.
D:\javaprac\37_collection_framework\9_Map_Hashtable>java A
Exception in thread "main" java.lang.NullPointerException
        at java.base/java.util.Hashtable.put(Hashtable.java:476)
        at A.main(A.java:8) */