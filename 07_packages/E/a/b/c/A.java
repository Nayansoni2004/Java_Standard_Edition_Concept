//package declaration.
package a.b.c;

//import statement.
import x.y.B;

class A {
    //main method...
    public static void main(String[] args) {

        B b = new B();

        b.pro();
    }
}

/*Happily compiled and also runed because B class is defined as public and its method is also defined as public
and now can be accessed from outside the package*/

/* OUTPUT:
Hello World!!!
*/