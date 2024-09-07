//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class E extends A {

    //main method.
    public static void main(String[] args) {

        E e = new E();

        e.pro();
    }
}
/* access through inheritance in different package location is not possible when class ka 
member method private mark ho bahle hi class public mark h lekin uska member private mark h
to access nhi kr sakte.

OUTPUT:x\y\E.java:14: error: cannot find symbol
        e.pro();
         ^
  symbol:   method pro()
  location: variable e of type E
1 error
*/