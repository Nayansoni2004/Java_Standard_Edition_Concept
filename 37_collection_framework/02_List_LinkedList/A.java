import java.util.LinkedList;
class A {
    //main method
    public static void main(String[] args) {
        //LinkedList as a List...
        LinkedList x = new LinkedList();

        x.add(34); //Integer Object banega or auto-boxing hogi, internally. 
        x.add(56); //Integer Object banega or auto-boxing hogi, internally.
        x.add(78); //Integer Object banega or auto-boxing hogi, internally.
        x.add(12); //Integer Object banega or auto-boxing hogi, internally.
        x.add(8); //Integer Object banega or auto-boxing hogi, internally.

        System.out.println(x);//internally Object class ki toString() method call hogi,print hone se pahle.
        
        System.out.println(x.remove(0));
        System.out.println(x.remove(0));
        System.out.println(x.remove(0));
        System.out.println(x.remove(0));
        System.out.println(x.remove(0));

        System.out.println(x);//internally Object class ki toString()method call nhi hogi,print krne se pahle,bec. no record is left in a List. 
    }
}
/*OUTPUT:
[34, 56, 78, 12, 8]
34
56
78
12
8
[] */