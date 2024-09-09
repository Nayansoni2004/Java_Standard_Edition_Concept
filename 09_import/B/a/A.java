//package declaration 
package a;

//import statement
//import x.B;
//import x.y.C;

//wide card character
import x.*;

class A {

    //main method 
    public static void main(String[] args) {

        B x = new B();

        C y = new C();
    }
}
/* a\A.java:18: error: cannot find symbol
        C y = new C();
        ^
  symbol:   class C
  location: class A
a\A.java:18: error: cannot find symbol
        C y = new C();
                  ^
  symbol:   class C
  location: class A
2 errors

error aai kyuki (wide card character) kewal 1 package k andar ki classes ko access krta h, or C class Y package
k andar h or import x.* krne se kewal x package ki classes access hongi, y package k andar ki nhi hongi,
isley (wide card character) ka use krna recommanded tarika nhi h. */