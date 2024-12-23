import java.util.LinkedHashMap;
class A {
    //main method
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        System.out.println(map); //jis order m insertion kia h usi order pe print hoga.
    }
}
/*OUTPUT: jis order m insertion kia h usi order m print hoga,kyuki LinkedHashMap is ordered but not sorted.
{mohan=78, rohan=89, sohan=62, ganesh=100, vikram=56} */