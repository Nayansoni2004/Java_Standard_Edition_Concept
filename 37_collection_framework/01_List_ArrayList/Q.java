import java.util.ArrayList;
class Q {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(34);
        x.add(12);
        x.add(56);
        x.add(2.34f);
        x.add(21);

        System.out.println(x);
    }    
}
/*OUTPUT: Compilation-failed.kyuki hum Integer type-safe declare kr k float record/value add kr rhe.
D:\javaprac\37_collection_ArrayList>javac Q.java
Q.java:10: error: incompatible types: float cannot be converted to Integer
        x.add(2.34f);
              ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error */