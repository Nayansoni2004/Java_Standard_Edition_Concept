class Y1 {
    //overridden method version.
    void pro() {
        System.out.println("pro method in Y1 parent");
    }
}

class D extends Y1 {
    //overriding method version.
    void pro() {
        System.out.println("pro method in D child");
    }
    //main method
    public static void main(String[] args) {
        
        Y1 a = new Y1();

        a.pro();
    }
}
/* OUTPUT:   pro method in Y1 parent
D child class m Y1 parent class type ka var. or object banayenge or us var. k through method ko call krenge,to
parent class ka overridden method version run hoga,kyuki ki object or var. dono parent class k banaye h,
is case m child ka overriding version run nhi hoga.
*/