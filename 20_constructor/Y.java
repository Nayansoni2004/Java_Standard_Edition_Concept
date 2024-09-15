class D1 {
    //programmer supplied(SINGLE PARAMETERIZED)constructor
    D1(int y) {
        System.out.println(y);
    }
}

class Y extends D1 {
    //instance-level var. member
    int t = 9;

    //programmer supplied(NO PARAMETERIZED)constructor
    Y() {
        super(t);
    }
    //main method
    public static void main(String[] args) {

        Y q = new Y();

        System.out.println(q.t);
    }
}
/* Y.java:14: error: cannot reference t before supertype constructor has been called
        super(t);
              ^
1 error
class load hogi or Y class type ka var. q stack memory m ban jayega or object banane k baad is var. m object ka
ref. code aake assign ho jayega,ab new keyword se 1 plan object heap memory m ban jayega,or Y()constructor call
hoga or fist line statement super(t);call hoga,or kyuki super call complete hone k baad instance-level member
class m initialize hote h,to bina initialize kre super(t);call m hi t var. ko call kr liye h,jo ki avi initialize 
hi nhi hua avi to usko object m bs memory allocate hui h,or jub super call complete ho jayega jub to constructor 
us object ko t var. ki value se initialize krega.isley error aai,but agar t var. ko static mark kr de to wo 
class load hone pr hi usko ClassObject m memory allocate ho jayegi or super(t); call k anadar us static member
ko call kr payenge,kyuki wo initialize classObject m hi ho chuka h.this we will see in next.java source file.
*/