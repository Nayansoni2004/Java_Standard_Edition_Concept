import java.util.HashSet;
class B {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set);

        set.add(56);//internally auto-boxing hogi,Interger obj. banega or kahi random space pe record add hoga.
        set.add(12);//internally auto-boxing hogi,Interger obj. banega or kahi random space pe record add hoga.
        set.add(68);//internally auto-boxing hogi,Interger obj. banega or kahi random space pe record add hoga.
        set.add(21);//internally auto-boxing hogi,Interger obj. banega or kahi random space pe record add hoga.
        set.add(19);//internally auto-boxing hogi,Interger obj. banega or kahi random space pe record add hoga.

        System.out.println(set.size()); //int<-return type
        System.out.println(set.isEmpty()); //boolean<-return type
        System.out.println(set);//internally Object class ki toString()call hogi or String.... 
    }
}
/*OUTPUT:
0
true
[]
5
false
[19, 68, 21, 56, 12]
 */