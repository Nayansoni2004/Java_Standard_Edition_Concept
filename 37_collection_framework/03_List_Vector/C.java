import java.util.Vector;
class C {
    //main method
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(1); //internally auto-boxing hogi Interger Obj. banega or ref. code index-0 pe store hoga.
        v.add(11);//internally auto-boxing hogi Interger Obj. banega or ref. code index-1 pe store hoga.
        v.add(21);//internally auto-boxing hogi Interger Obj. banega or ref. code index-2 pe store hoga.
        v.add(31);//internally auto-boxing hogi Interger Obj. banega or ref. code index-3 pe store hoga.
        v.add(41);//internally auto-boxing hogi Interger Obj. banega or ref. code index-4 pe store hoga.
        v.add(51);//internally auto-boxing hogi Interger Obj. banega or ref. code index-5 pe store hoga.
        v.add(61);//internally auto-boxing hogi Interger Obj. banega or ref. code index-6 pe store hoga.
        v.add(71);//internally auto-boxing hogi Interger Obj. banega or ref. code index-7 pe store hoga.
        v.add(81);//internally auto-boxing hogi Interger Obj. banega or ref. code index-8 pe store hoga.
        v.add(91);//internally auto-boxing hogi Interger Obj. banega or ref. code index-9 pe store hoga.

        System.out.println(v.capacity());

        v.add(101);//internally auto-boxing hogi Interger Obj. banega or ref. code index-10 pe store hoga.

        System.out.println(v.capacity());
    }
}
/*OUTPUT:Vector ki initial capacity 10 hoti h,or jese hi 11th record add krte h,capacity siddhe double ho jati h.
10
20  
 */