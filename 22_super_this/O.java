class J1 {
    //programmer supplied(NO-PARAMETERIZED)constructor
    J1() {
        System.out.println(this + "~~~~~~~~~1");
    }
}

class J2 extends J1 {
   //programmer supplied(NO-PARAMETERIZED)constructor
    J2() {
        System.out.println(this + "~~~~~~~~~2");
    }
}

class O extends J2 {
    //programmer supplied(NO-PARAMETERIZED)constructor
    O() {
        System.out.println(this + "~~~~~~~~~~3");
    }
    //main method
    public static void main(String[] args) {
        O x = new O();

        System.out.println(x + "~~~~~~~~~~~4");
    }
}
/* OUTPUT:
O@23fc625e~~~~~~~~~1
O@23fc625e~~~~~~~~~2
O@23fc625e~~~~~~~~~~3
O@23fc625e~~~~~~~~~~~4
sub constructor k andar "this" likha h or "this"current instance ka ref. code la kr deta h kyuki "this" current 
instance ki baat krta h ,or chaining to to O()constructor call hoga or uska super();call hoga to J2()constructor
stack up ho jayega then,uska super();call hoga to J1()constructor stack up ho jayega then,uska super();call hoga
to Object()constructor stack up to jayega then, 1-1 krke construtor pop-out honge or unke andar ka code execute
hoga to Object ka re. code print hoga,matlab constructor k anadr object ref. var. nhi rakh sakte lekin "this" ka
use kr k object ka ref. code print krwa sakte h. */