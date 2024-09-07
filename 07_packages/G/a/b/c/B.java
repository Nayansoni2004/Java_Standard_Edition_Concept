//package declaration.
package a.b.c;

class B {

    //main method.
    public static void main(String[] args) {

        A a = new A();

        a.pro();
    }
}

/* access through instantiation in same package folder is not possible jub class ka member method
private mark ho.

OUTPUT:a\b\c\B.java:11: error: pro() has private access in A
        a.pro();
         ^
1 error
*/