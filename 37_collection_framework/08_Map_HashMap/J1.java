import java.util.HashMap;
class J1 {
    //main method
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        Boolean x = map.containsKey("yamraj");//<-key column m check krega "yamraj" key h kya,boolean result return krega.

        System.out.println(x); //false
    }
}
//OUTPUT: false <-false aaya kyuki map m "yamraj" key exists nhi krta h.