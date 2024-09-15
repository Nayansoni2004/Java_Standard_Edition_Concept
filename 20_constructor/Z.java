class D1 {
    //programmer supplied(SINGLE PARAMETERIZED)constructor
    D1(int y) {
        System.out.println(y); //idhar wo super m call kia gya 12 print hoga.
    }
}

class Z extends D1 {
    //instance level(non-static)var. member
    int t = 12;

    //programmer supplied(NO PARAMETERIZED)constructor
    Z() {
        super(12);
    }
    //main method
    public static void main(String[] args) {
        
        Z q = new Z();

        System.out.println(q.t);
    }
}
/* OUTPUT:
12
12
super(12);call m 12 as a parameter pass kia h to jub super call hoga to D1()constructor m (int y) var. m 12 jake
assign ho jayega or ab constructor ka code run ho chuka h,matlab object ban gya h,ab object ka ref. code q var.
m aake hold ho jayega,or jub ref. var. name dot membername call krenge to 12 print hoga or ik 12 super(12);call
k andar ka print hoga.
*/