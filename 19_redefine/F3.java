class X {
    //instance level var. member
    int a = 6;
}

interface Y {
    //bydefault static var. member
    int a = 12;
}

class F3 extends X implements Y {
    //main method
    public static void main(String[] args) {

        System.out.println(Y.a); 
    }
}
/*  D:\javaprac\19_redefine>java F3
    12
NOTE: me bolunga to ro doge nayan,interface ka var. bydefault static hota h,to static member ko static context m
direct access kr sakte h,isley bina instance banaye interface k var. ko direct call kr lia...print statement m
interface ka name dot var. ka name likh kr.
*/
