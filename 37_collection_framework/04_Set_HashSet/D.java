import java.util.HashSet;
class D {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(56);
        set.add(12);
        set.add(68);
        set.add(21);
        set.add(19);

        System.out.println(set.contains(78)); //false {contains(Object)<-return type boolean}
        System.out.println(set.contains(68)); //true {contains(Object)<-return type boolean}
    }
}
//OUTPUT: false 
//OUTPUT: true