import java.util.HashMap;
class C {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("yam" , 62);
        map.put("rohan" , 89);
        map.put("sohan" , 62); //duplicate values are allowed but duplicate keys are not allowed.
        map.put("ganesh" , 100);
        map.put("vikram" , 56);
        map.put("golu" , 62);

        System.out.println(map);
    } 
}
/*OUTPUT:In HashMap duplicate values are allowed but duplicate keys are not allowed.
{sohan=62, golu=62, rohan=89, vikram=56, yam=62, mohan=78, ganesh=100} */