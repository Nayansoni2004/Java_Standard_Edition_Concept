//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class D {

    //main method
    public static void main(String[] args) {

        System.out.println("Bye");
    }
}
/*
x\y\D.java:5: error: A is not public in a.b.c; cannot be accessed from outside package
import a.b.c.A;
            ^
1 error

agar kisi class pe default access control laga h to wo class different package location m import nhi kr sakte or instantion k 
through bhi access nhi kr sakte h.

*/