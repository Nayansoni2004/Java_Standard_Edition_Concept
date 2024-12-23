import java.util.HashMap;
class F {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map.get("ganesh"));//<-get(object key)<-key do value return krta h.
        System.out.println(map);
    }
}
/*OUTPUT:
100 <-value of key"ganesh".
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100} */