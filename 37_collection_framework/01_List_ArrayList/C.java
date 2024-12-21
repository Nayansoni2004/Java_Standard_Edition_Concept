import java.util.ArrayList;
class C {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x);
        System.out.println(x.isEmpty());
        System.out.println(x.size());

        x.add(12); //auto-boxing hogi,kyuki Interger Object banega.
        x.add(45); //auto-boxing hogi,kyuki Interger Object banega.
        x.add(78); //auto-boxing hogi,kyuki Interger Object banega.
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        System.out.println(x);
        System.out.println(x.isEmpty());
        System.out.println(x.size());
    }
}
/*OUTPUT:
[]
true
0
~~~~~~~~~~~~~~~~~~~~
[12, 45, 78]
false
3   */