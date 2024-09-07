//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class E extends A {

    //main method
    public static void main(String[] args) {

        E e = new E();

        e.pro();
    }
}
/*
x\y\E.java:14: error: cannot find symbol
        e.pro();
         ^
  symbol:   method pro()
  location: variable e of type E
1 error

agar kisi class ka member bydefault:default mark h to wo different package location m inheritance k through acccess 
nhi kr sakte, kewal same package location m access kr sakte h instantiation or inheritance dono k through.
*/