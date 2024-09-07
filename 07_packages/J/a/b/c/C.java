//package declaration.
package a.b.c;

class C extends A {

    //main method
    public static void main(String[] args) {
        
        C c = new C();

        c.pro();
    }
}
/* OUTPUT:protected member of A class is accessed

agar kisi class ka member protected mark h to wo same package location m inheritance k through access kr sakte h.

*/