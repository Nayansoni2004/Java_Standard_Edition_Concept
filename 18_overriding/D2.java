class Y1 {
    //overridden method version
    void pro() {
        System.out.println("pro method in Y1 parent");
    }
}

class D2 extends Y1 {
    //overriding method version
    void pro() {
        System.out.println("pro method in D2 child");
    }
    //main method
    public static void main(String[] args) {
        
        //Y1 a = new Y1();
        //D2 a = new D2();
        Y1 a = new D2(); //polymorphic assignment.

        a.pro(); //polymorphic method call/invocation.
    }
}
/* OUTPUT:   pro method in D2 child
polymorphic assignment matlab parent class var. m child class k object ka ref. code rakha h,or compiler var. ka
type check krega ki var. parent type ka h,to parent ka method version run hoga,ji me kon compiler,,to var. ka 
type check kr k code pass kr dega,or runtime dekhega ki object child ka h or over-riding ho rhi h turant DYNAMIC
METHOD DIS-PATCH occur hoga or object ka type check krega or object child ka h or child k pas khud ka overriding
method version h,to child ka version hi run hoga.
Every happens in this code due to over-riding.
*/ 