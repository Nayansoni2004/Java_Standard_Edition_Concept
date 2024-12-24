//Concept: toArray();<-method collection Interface ki use kr k hum ArrayList ko Array m convert kr sakte h.
import java.util.ArrayList;
class A {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Object[] arr = x.toArray();//ye method ArrayList ko Array m convert kr deta h,or return arr(array) of Object krta h.
        //Iterating Array of Object through Enhanced-for loop.
        for(Object obj : arr) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

       // System.out.println(arr.get(0));//error:cannot find symbol bec. get()<-method Array m nhi h ArrayList m h.
    }
}
/*OUTPUT: line 26 get()<-method ka output,error kyuki Array pe hum get()<-method call nhi kr sakte,Array m
          property hoti h length.
D.java:26: error: cannot find symbol
        System.out.println(arr.get(0));
                              ^
  symbol:   method get(int)
  location: variable arr of type Object[]
1 error */

/*OUTPUT: ArrayList ko array m convert krne k baad array k records print kiye.
12
13
15
21
9

12
13
15
21
9 */