class X {
    //programmer supplied(SINGLE PARAMETERIZED)constructor
    X(int y) {

    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    X() {
        super();
        this(2);
    }
}
/* X.java:9: error: call to this must be first statement in constructor
        this(2);
            ^
1 error
this(); or super(); 1 sath 1 hi constructor k andar nhi kr sakte,kyuki tum bol rhe ho ki constructor tum super();
matlab super class k constructor ko call kro or usi constructor se bol rhe h ki tum this(2); matlab apni hi
class k overloaded (int y)parameterized constructor ko bhi call kro,isley error aai or constructor m ya to this
call hoga ya to super call hoga. */