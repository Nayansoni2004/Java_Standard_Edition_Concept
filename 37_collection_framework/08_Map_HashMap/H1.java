import java.util.HashMap;
class H1 {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        Integer x = (Integer)map.get("sohan");//<-key do value return krta h get(Object key)method.

        System.out.println(x); //value print hogi jo x var. m rakhi h,kyuki typecast kr dia h humne Object ko Integer m.
    }
}
/*OUTPUT:
62 <-value h ye "sohan" key ki. */