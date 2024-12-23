import java.util.HashMap;
class H {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("mohan" , 78);
        map.put("rohan" , 89);
        map.put("sohan" , 62);
        map.put("ganesh" , 100);
        map.put("vikram" , 56);

        Integer x = map.get("sohan");//<-key do value return krta h get(Object key)method.
        System.out.println(x);
    }
}
/*OUTPUT:get()<-method object ka ref. code return kr rhi h jo ki Object type ka h or sub ka parent h,to us ka
         ref. code child class Integer m nhi rakh sakte h,isley error aai. 
H.java:13: error: incompatible types: Object cannot be converted to Integer
        Integer x = map.get("sohan");//<-key do value return krta h get(Object key)method.
                           ^
Note: H.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error */