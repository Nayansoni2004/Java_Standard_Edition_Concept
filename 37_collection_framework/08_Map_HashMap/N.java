import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry; //<-nested(sub-Interface) of Interface Map.
class N {
    //main method
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map);

/*returnType*/Set<Entry<String,Integer>> set = map.entrySet();//<-returns a set-view of mappings contained in this map.
        //iterating map using Enhanced for-loop by making Entry ka set using HashMap.
        for(Entry<String,Integer> ent : set) {
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
    }
}
/*OUTPUT: bina keySet()<-ka use kre humne iterate kia h map ko.using Map Interface entrySet()<-method & Enhanced forloop.
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
sohan - 62
rohan - 89
vikram - 56
mohan - 78
ganesh - 100 */