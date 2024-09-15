class X2 {
    //programmer supplied(SINGLE PARAMETERIZED)constructor
    X2(int X) {

    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    X2() {
        this(2); super();
    }
}
/* X2.java:8: error: call to super must be first statement in constructor
        this(2); super();
                      ^
1 error 
error aai kyuki 1 hi constructor k andar this(); or super(); call dono 1 sath nhi likh sakte,ya to this();call 
statement hoga ,ya to super();call statement hoga,or ;semicolon line m laga dia matlab line complete(terminate)
ho gyi or ab next line se execution start hoga.matlab this(); or super();call single line m bhi nhi kr sakte.
*/