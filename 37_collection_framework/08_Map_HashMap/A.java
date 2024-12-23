import java.util.HashMap;
class A {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map);
    }
}
/*OUTPUT:HashMap neither ordered nor sorted collection class h,Map m records add krne k liye put(k key , v value)
         method ka use krte h.
{sohan=62, rohan=89, vikram=56, mohan=78, ganesh=100} */