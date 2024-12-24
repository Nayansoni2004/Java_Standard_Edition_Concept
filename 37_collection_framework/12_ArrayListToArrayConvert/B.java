import java.util.ArrayList;
class B {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = new Integer[0];
        Integer[] arr = x.toArray(ar);/*<-toArray(T[] a)method type safe array return krta h,or ye toArray(ar)m 
                                        hume ne (ar) arrayobj pass kia h,to ye Object return kr rha h,or Object 
                                        parent ko child Integer m assign nhi kr sakte,isley error aaya.*/ 
        //Iterating array of type Integer through Enhanced for loop.
        for(Integer obj : arr) {
            System.out.println(obj);
        }
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\12_ArrayListToArrayConvert>javac B.java
B.java:14: error: incompatible types: Object[] cannot be converted to Integer[]
        Integer[] arr = x.toArray(ar);/*<-toArray(T[] a)method type safe array return krta h,or ye toArray(ar)m
                                 ^
Note: B.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error */