class D1 {
    //programmer supplied(SINGLE PARAMETERIZED)constructor
    D1(int y) {
        System.out.println(y);
    }
}

class Y1 extends D1 {
    //non-instance-level var. member
    static int t = 9;

    //programmer supplied(NO-PARAMETERIZED)constructor
    Y1() {
        super(t); //is line ka t var. print ho jayega.
    }
    //main method
    public static void main(String[] args) {

        Y1 q = new Y1();

        System.out.println(q.t);//is line ka bhi t var. print ho jayega.
    }
}
/* OUTPUT: happily compiled....
9
9
super(t);call m class k static var. ko call kr sakte h,kyuki static var. class load hone pr hi classObject m 
initialize ho jate h,isley static var. ko super(t);call m access kr sakte h,but instance-level var. ko super(t);
call m call nhi kr sakte,kyuki super();call complete hone k baad hi instance var. object m initialize hote h,
or super();call bina compete hue access kr lenge to wo initialize hi nhi hua h to kese access kr lenge.isley
super(t); call m kewal static var. ko call kr sakte h,kyuki wo class load hone pr hi initialize ho chuka hoga.
*/