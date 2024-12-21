import java.util.Vector;
class D {
    //main method
    public static void main(String[] args) {
        Vector v = new Vector(10 , 2);//Vector m constructor h vector(initialCapacity , capacityIncrement).

        v.add(1);//internally auto-boxing hogi,Interger obj. banega or ref. code index-0 m store hoga.
        v.add(11);//internally auto-boxing hogi,Interger obj. banega or ref. code index-1 m store hoga.
        v.add(21);//internally auto-boxing hogi,Interger obj. banega or ref. code index-2 m store hoga.
        v.add(31);//internally auto-boxing hogi,Interger obj. banega or ref. code index-3 m store hoga.
        v.add(41);//internally auto-boxing hogi,Interger obj. banega or ref. code index-4 m store hoga.
        v.add(51);//internally auto-boxing hogi,Interger obj. banega or ref. code index-5 m store hoga.
        v.add(61);//internally auto-boxing hogi,Interger obj. banega or ref. code index-6 m store hoga.
        v.add(71);//internally auto-boxing hogi,Interger obj. banega or ref. code index-7 m store hoga.
        v.add(81);//internally auto-boxing hogi,Interger obj. banega or ref. code inde-8 m store hoga.
        v.add(91);//internally auto-boxing hogi,Interger obj. banega or ref. code index-9 m store hoga.

        System.out.println(v.capacity()); //capacity()<-return type int,returns the current capacity of this Vector.

        v.add(101);//internally auto-boxing hogi,Interger obj. banega or ref. code index-10 m store hoga.

        System.out.println(v.capacity());
    }
}
/*OUTPUT:initial capacity 10 hoti h vector ki,kyuki Constructor m increment ki h to jese hi 11th record add krenge
         capacity 10+2= 12 ho jayegi. 
10
12
 */