import java.util.HashMap;
class B {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);
        map.put("sohan" , 34); //old value replace ho jayega,new value update ho jayega,agar key same h to.

        System.out.println(map);
    }
}
/*OUTPUT: duplicate key denge to existing key ki value replace/update ho jayegi duplicate key ki value se.
{sohan=34, rohan=89, vikram=56, mohan=78, ganesh=100} */