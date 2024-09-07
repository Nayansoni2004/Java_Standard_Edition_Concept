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
/*
OUTPUT:x\y\D.java:13: error: pro() is not public in A; cannot be accessed from outside package
        a.pro();
         ^
1 error

agar kisi class ka member bydefault:default marked h to wo different package location m instantiation k through
access nhi kr sakte.
*/