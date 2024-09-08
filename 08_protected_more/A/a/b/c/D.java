//package declaration.
package a.b.c;

class D {

    //main method
    public static void main(String[] args) {

        A x = new A();

        x.pro();
    }

}
/*
OUTPUT:protected member is accessed.

A class ka member protected h or same package location m instantiation k through, D class m A class ka object bna 
k us member ko access kr sakte h, but D class ka object nhi banayenge kyuki D class A class ka chind nhi h.

*/
