import java.util.TreeMap;
class A {
    //main method
    public static void main(String[] args) {
        TreeMap map = new TreeMap();

        map.put(786 , "mohan");
        map.put(234 , "hitesh");
        map.put(621 , "raghav");
        map.put(128 , "naman");
        map.put(834 , "sudhir");
        map.put(542 , "jagtap");
        
        System.out.println(map);//key k basis pe automatic sorting hogi.
    }
}
/*OUTPUT:key k basis pe automatic sorting hogi,kyuki TreeMap sorted collection class h,or value duplicate ho 
         sakti h,lekin key unique hi hongi,isley key k basis pe sorting hui.
{128=naman, 234=hitesh, 542=jagtap, 621=raghav, 786=mohan, 834=sudhir} */