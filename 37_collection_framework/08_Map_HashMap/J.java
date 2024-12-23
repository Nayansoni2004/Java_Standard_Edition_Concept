import java.util.HashMap;
class J {
    //main method
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        Boolean x = map.containsKey("sohan");//<-key column m check krega ki aisa koi key h kya,or boolean result return krega.

        System.out.println(x);
    }
}
//OUTPUT: true <-true aaya kyuki key column m sohan key exists krta h.