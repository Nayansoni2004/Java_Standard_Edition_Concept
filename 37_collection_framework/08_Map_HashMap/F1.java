import java.util.HashMap;
class F1 {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map.get("yamraj"));//<-get(object key)<-key do value return krta h
        System.out.println(map);
    }
}
/*OUTPUT: agar hum aisi key ki value pta krna chahete h jo key hi exists nhi krti h map m to null return krta h
          get(Object key) method.
null
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100} */