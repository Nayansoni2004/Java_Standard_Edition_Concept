import java.util.HashSet;
class A {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet(); //neither ordered nor sorted collection class.

        System.out.println(set.size()); //0(zero)
        System.out.println(set.isEmpty()); //true
        System.out.println(set); //[]
    }
}
/*OUTPUT:
0
true
[]
 */