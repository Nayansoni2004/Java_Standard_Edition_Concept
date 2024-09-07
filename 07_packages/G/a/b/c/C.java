//package declaration.
package a.b.c;

class C extends A {

    //main method.
    public static void main(String[] args) {

        C c = new C();

        c.pro();
    }
}

/*  access through inheritance in same package location is not possible when class ka 
member method jisko access kr rhe h wo private mark h bhale hi class public mark kyu na ho
pr agar member private mark h to access nhi kr sakte.

OUTPUT:a\b\c\C.java:11: error: cannot find symbol
        c.pro();
         ^
  symbol:   method pro()
  location: variable c of type C
1 error
*/