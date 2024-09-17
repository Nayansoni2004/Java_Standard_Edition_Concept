class X1 {
    //programmer supplied(ONE-PARAMETERIZED)constructor
    X1(E2 s) {

    }
}

class E2 extends X1 {
    //programmer supplied(NO-PARAMETERIZED)constructor
    E2() {
        super(this);
    }
}
/* E2.java:11: error: cannot reference this before supertype constructor has been called
        super(this);
              ^
1 error
error aai kyuki "this" instance-level var. h or super();call m instance-level member ko as a argument pass nhi kr 
sakte or super(this); no-argument call hota h,jo ki parent k construtor ko call krta h jis se ki chaining ho sake
,isley super();call m instance-level var. "this" as a argument pass nhi kr sakte.
or main reason super(this); m this likha h to super se X1 class ka constructor call hoga uske andar var. s ka type
E2 class h but X1 parent ko to pta hi nhi h ki mera koi child bhi h,isley super k andar this nhi likh sakte. */