import java.util.ArrayList;
import java.util.Collections;
class A {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        System.out.println(x);

        Collections.sort(x);//sort()<-Collections class ki static method h,returnType void,list pass kro sort kr deti h Ascending order m.

        System.out.println(x);
    }
}
/*OUTPUT: 
[12, 13, 15, 21, 9]
[9, 12, 13, 15, 21] */