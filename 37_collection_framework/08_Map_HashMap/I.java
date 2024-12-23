import java.util.HashMap;
class I {
    //main method
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        Integer x = map.get("sohan");//<-key do value return krta h get(Object key)method.

        System.out.println(x);/*HashMap class ko type-safe declare kia h to get()method jo object return krega,
                                compiler khud hi us Object ko Integer m type-cast kr lega,internally isley hume
                                type-safety dene k baad type-cast nhi krna pada. */
    }
}
/*OUTPUT:
62 <-key "sohan" ki value 62 return hui h kyuki type-safe declare kia h. */