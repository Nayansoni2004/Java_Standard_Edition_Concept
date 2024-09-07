//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class D {
    //main method.
    public static void main(String[] args) {

        A a = new A();

        a.pro();
    }
}

/* access through instantiation in different package location is not possible when class ka 
member private mark ho.

OUTPUT:x\y\D.java:13: error: pro() has private access in A
        a.pro();
         ^
1 error

*/