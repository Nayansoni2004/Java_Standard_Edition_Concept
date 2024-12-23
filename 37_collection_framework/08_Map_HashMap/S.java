import java.util.HashMap;
class S {
    //main method
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , null);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , null);

        System.out.println(map);//sare print ho jayenge kyuki acc. to property key as well as value can be null.
    }
}
/*OUTPUT:
{sohan=62, rohan=null, vikram=null, mohan=78, ganesh=100} */