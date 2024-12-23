import java.util.HashMap;
class G {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map);

        System.out.println(map.remove("ganesh"));//<-key do value remove kr deta h ye method,or return bhi krta h ki kya value remove ho rhi h.

        System.out.println(map);
    }
}
/*OUTPUT:
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
100
{sohan=62, rohan=89, vikram=56, mohan=78} */