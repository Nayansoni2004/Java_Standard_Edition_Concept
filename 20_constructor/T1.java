class WW {
    //programmer supplied constructor
    private WW() {

    }
}

class T1 extends WW {
    //programmer supplied constructor
    T1() {

    }
}
/* T1.java:10: error: WW() has private access in WW
    T1() {
         ^
1 error

error aai kyuki T1()constructor k andar first line statement super(); call hoga,matlab WW class ka WW()constructor 
call hoga or kyuki WW()constructor private h jo ki kewal WW class k andar accessible h,isley T1()constructor 
WW()constructor ko call nhi kr payega or compilation error aaigi.
*/