import java.util.HashMap;
class K {
    //main method
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        Boolean x = map.containsValue(62);//value column m check krega ki aisa koi value exists krta h kya?or boolean result return krega.

        System.out.println(x); //true
    }
}
//OUTPUT: true <-true aaya kyuki value 62 exists krta h.