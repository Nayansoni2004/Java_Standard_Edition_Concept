class D1 {
    //programmer supplied(NO-PARAMETERIZED)constructor
    D1() {
        System.out.println(this + "~~~~~~~~~~");
    }
    //main method 
    public static void main(String[] args) {
        D1 x = new D1();

        System.out.println(x);
    }
}
/* OUTPUT:
D1@4a574795~~~~~~~~~~
D1@4a574795
NOTE: constructor k andar obj. ref. var. pass nhi kr sakte, lekin "this" keyword ka use kr k us current obj. ka 
reference code constructor m print kr skate h,jis current instance pr wo constructor run ho rha h,us instance ka
ref. code this ka use kr k us constructor ko mil jayega,kyuki this matlab current object jis pr wo constuctor avi
run ho rha h. */