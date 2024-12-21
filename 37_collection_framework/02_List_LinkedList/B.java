import java.util.LinkedList;
class B {
    //main method
    public static void main(String[] args) {
        //LinkedList as a List...
        LinkedList x = new LinkedList();

        x.add(34); //Integer Object banega or auto-boxing hogi, internally. 
        x.add(56); //Integer Object banega or auto-boxing hogi, internally.
        x.add(78); //Integer Object banega or auto-boxing hogi, internally.
        x.add(12); //Integer Object banega or auto-boxing hogi, internally.
        x.add(8); //Integer Object banega or auto-boxing hogi, internally.

        System.out.println(x);//internally Object class ki toString()method call hogi,or String return kregi Object ka.

        System.out.println(x.get(0));
        System.out.println(x.get(1));
        System.out.println(x.get(2));
        System.out.println(x.get(3));
        System.out.println(x.get(4));

        System.out.println(x);//internally Object class ki toString()method call hogi,or String return kregi object ka. 
    }  
}
/*OUTPUT:
[34, 56, 78, 12, 8]
34
56
78
12
8
[34, 56, 78, 12, 8] */