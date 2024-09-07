/*concept of this code: Default(package level access control) same package location m instantiation or inheritance
dono k through access kr sakte h, but different package location h dono k through access nhi kr sakte h. */ 

//package declaration.
package a.b.c;

class B {

    //main method.
    public static void main(String[] args) {

        A a = new A();

        a.pro();
    }
}

/* 
OUTPUT:Default:(package level access control)

agar kisi class ka member bydefault:default marked h to wo same package location m instantiation k through accessible
hota h.
*/