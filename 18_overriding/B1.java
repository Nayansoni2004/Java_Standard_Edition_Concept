// OVER-LOADING.........
class X3 {
    //method member
    void pro() {
        System.out.println("pro method in X3");
    }
}

class B1 extends X3 {
    //legal method overloading...
    void pro(int x) {
        System.out.println("pro method in B1");
    }
    //main method
    public static void main(String[] args) {

        B1 x = new B1();

        x.pro();
        x.pro(12);
    }
}
/* OUTPUT:  pro method in X3
            pro method in B1
1 class m same name se multiple methods bana sakte h,but kewal 1 hi rule h ki parameter body must mis-match hona
chahiye,mandatory h,Or X3 class ki method B1 child m inherit ho rhi h,or kyuki parameter body mis-matched h,to
method overload ho jayegi,or x.pro(); ko call krne pr parent ka method run hoga,or x.pro(); m koi integer value
as a parameter pass krne pr child ka method version run hoga,kyuki same name se 2 methods h,or parameter body
mis-match h,or child ka object bana k call kr rhe h,kyuki method instance level h to jis method ka parameter 
call statement m pass krenge wo wala method version run hoga...
*/