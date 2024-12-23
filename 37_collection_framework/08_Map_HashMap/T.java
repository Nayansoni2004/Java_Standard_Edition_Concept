import java.util.HashMap;
class T {
    //main method
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan" , 78);
        map.put(null , 54);//key1
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put(null , 12);//duplicate key2

        System.out.println(map);
    }
}
/*OUTPUT: last record m key duplicate ho gyi isley existing key null ki value replace ho jayegi 54 se 12 ho 
          jayegi or null=12 sirf 1 bar print hoga.kyuki key null already exists krti h.
{null=12, sohan=62, mohan=78, ganesh=100} */