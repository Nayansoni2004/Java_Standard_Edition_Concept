import java.util.ArrayList;
class B2 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = null;//new array nhi banaya,length null h.
        Integer[] arr = x.toArray(ar);//length null,h to jub tak length read nhi hogi new array nhi ban payega.
        //Iterating array of type Integer through Enhanced forloop.
        for(Integer obj : arr) {
            System.out.println(obj);
        }
    }
}
/*OUTPUT:runtimeException(unchecked-Exception),toArray(ar)<-jis ArrayList obj. m call ho rha h,or hume type-safe
         array pass krna padta h,lekin uski length to null h,to kam h ya jada h,ye pta nhi chal payega,java ko
         matlab array ki length read nhi kr payega,to new array banana h ya nhi JVM ko kese pta chalega,to 
         Exception aayega. 
D:\javaprac\37_collection_framework\12_ArrayListToArrayConvert>java B2
Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "a" is null
        at java.base/java.util.ArrayList.toArray(ArrayList.java:398)
        at B2.main(B2.java:14) */