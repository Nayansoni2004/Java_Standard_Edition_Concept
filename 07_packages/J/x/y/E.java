//package declaration.
package x.y;

//import statement
import a.b.c.A;

class E extends A {
    //main method
    public static void main(String[] args) {

        E e = new E();

        e.pro();
    }
}
/*OUTPUT:protected member of A class is accessed

agar kisi class ka member protected mark h to wo different package location m inheritance k
through access kr skate h.

*/