import java.util.HashSet;
class E {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(56);
        set.add(12);
        set.add(68);
        set.add(21);
        set.add(19);

        System.out.println(set);

       // System.out.println(set.remove(68)); //remove(Object)<-return type boolean.
        System.out.println(set.remove(99)); //remove(Object)<-return type boolean.

        System.out.println(set);
    }    
}
/*OUTPUT: existing element remove(delete) ho gya.
[19, 68, 21, 56, 12]
true
[19, 21, 56, 12] */

/*OUTPUT: non-existing element remove nhi hoga,or set as it is print hoga.
[19, 68, 21, 56, 12]
false
[19, 68, 21, 56, 12] */