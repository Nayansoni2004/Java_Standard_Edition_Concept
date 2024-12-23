import java.util.HashMap;
class I1 {
    //main method
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("mohan" , 78);
        map.put("rohan" , "JEC");
        map.put("sohan" , 62);
        map.put(456 , 100);
        map.put("vikram" , 56);

        Integer x = map.get("sohan");//<-key do value return krta h get()method.
        System.out.println(x);
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\8_Map_HashMap>javac I1.java
I1.java:8: error: incompatible types: String cannot be converted to Integer
        map.put("rohan" , "JEC");
                          ^
I1.java:10: error: incompatible types: int cannot be converted to String
        map.put(456 , 100);
                ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors */