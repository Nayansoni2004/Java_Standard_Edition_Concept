class X5 {
    //overridden method version
    void pro() {
        System.out.println("pro method in X5");
    }
}

class C1 extends X5 {
    //legal method overriding!!!
    //overriding method...
    void pro() {
        System.out.println("pro method in C1");
    }
    //main method
    public static void main(String[] args) {

        C1 x = new C1();

        x.pro();
        x.pro();
    }
}
/* OUTPUT:   pro method in C1
             pro method in C1
kitni bhi bar child class ka object bana k pro method ko call kr le ,har bar child class ka hi method version 
run hoga,kyuki child ne parent k method ko redefine kia h,or compiler kehta h ki me var. ka type check krunga,
or var. class C1 type ka h,to C1 ka method version run hoga,ji me kon-compiler,or compiler code ko pass kr deta
h,runtime kehta h m object ka type check krunga kyuki overriding ho rhi h,or kyuki object bhi C1 class ka h,
or C1 k pas khud ka overriding version h,to runtime C1 class ka overriding version run krega...
*/