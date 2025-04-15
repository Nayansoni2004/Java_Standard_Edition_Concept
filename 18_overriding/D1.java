class Y1 {
    //overridden method version
    void pro() {
        System.out.println("pro method in Y1 parent");
    }
}

class D1 extends Y1 {
    //overriding method version
    void pro() {
        System.out.println("pro method in D1 child");
    }
    //main method
    public static void main(String[] args) {

        //Y1 a = new Y1();
        D1 a = new D1();

        a.pro();
    }
}
/* OUTPUT:    pro method in D1 child
D1 class m pro method ka redefined version h,or instance level h,to instance bana k call kr rhe h,or kyuki object
child class ka h or var. jo reference code ko hold krta h wo bhi child class ka h isley child ka overriding
version run hoga.
*/