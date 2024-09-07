//concept: default(package level access control).

//package declaration.
package a.b.c;

class C extends A {

    //main method.
    public static void main(String[] args) {

        C c = new C();

        c.pro();
    }

}
/*
OUTPUT:Default:(package level access control)

agar kisi class ka member bydefault: default marked h to wo same package location m inheritance k through accessible
h.

*/