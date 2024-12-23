import java.util.HashMap;
class G1 {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map);

        System.out.println(map.remove("yamraj"));

        System.out.println(map);
    }
}
/*OUTPUT:aise key denge remove krne k liye jo exists hi nhi krti h HashMap m to remove(Object key)<-method
         null return krega or kuch remove bhi nhi hoga map object ki properties as it is print ho jayengi. 
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100}
null
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100} */