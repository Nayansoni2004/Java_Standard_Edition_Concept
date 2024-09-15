class WW {
    //programmer supplied constructor...
    private WW() {

    }
}

class T2 extends WW {
    //programmer supplied constructor...
    T2() {
        super();
    }
}
/* T2.java:11: error: WW() has private access in WW
        super();
        ^
1 error

error aai kyuki T2()constructor ka first line statement super();call run hoga jo ki WW()constructor ko
call krega lekin WW()constructor pr private access control laga h,jo ki kewal apni class k andar accessible
h, isley T2()constructor WW()constructor ko call nhi kr payega or error aai gi,ki WW() has private access in class
WW.*/
