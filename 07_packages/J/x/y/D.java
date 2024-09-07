//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class D {

    //main method
    public static void main(String[] args) {

        A a = new A();

        a.pro();
    }
}
/*x\y\D.java:14: error: pro() has protected access in A
        a.pro();
         ^
1 error

agar kisi class ka member protected mark h to wo different package location m instantiation k through access nhi kr
sakte h.

*/