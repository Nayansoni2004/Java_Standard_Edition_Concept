import java.util.HashMap;
import java.util.Set;
class M {
    //main method
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map);
        //Normally,bina koi method use kre Enhanced for-loop se map ko iterate krne ki kosis.
        for(Object obj : map) {
            System.out.println(obj);
        }
    }
}
/*OUTPUT:
M.java:16: error: for-each not applicable to expression type
        for(Object obj : map) {
                         ^
  required: array or java.lang.Iterable
  found:    HashMap<String,Integer>
1 error */