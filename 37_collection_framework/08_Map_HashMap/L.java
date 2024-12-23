import java.util.HashMap;
import java.util.Set;
class L {
    //main method
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map);

        Set<String> set = map.keySet(); //returns a setview of keys contained in this map.
        //Iterating map using Enhanced for loop.
        for(String key : set) {
            System.out.println(key);
        }
    }
}
/*OUTPUT: after iterate the map using Map interface keySet()method the output is...
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
sohan
rohan
vikram
mohan
ganesh */