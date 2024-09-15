class X1 {
    //programmer supplied(SINGLE PARAMETERIZED)constructor
    X1(int x) {

    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    X1() {
        this(2);
        super();
    }
}
/* X1.java:9: error: call to super must be first statement in constructor
        super();
             ^
1 error
this(); or super(); 1 sath 1 hi constructor k andar nhi kr sakte,kyuki tum bol rhe ho ki constructor tum super();
matlab super class k constructor ko call kro or usi constructor se bol rhe h ki tum this(2); matlab apni hi
class k overloaded (int y)parameterized constructor ko bhi call kro,isley error aai or constructor m ya to this
call hoga ya to super call hoga. */