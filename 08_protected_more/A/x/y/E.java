//package declaration
package x.y;

//import statement.
import a.b.c.A;

class E {
    
    //main method
    public static void main(String[] args) {

        A x = new A();

        x.pro();
    }
}
/*
x\y\E.java:14: error: pro() has protected access in A
        x.pro();
         ^
1 error

A class ka member protected h or different package location m h or instantiation k through access krne m A 
class ka object E class m bna k us member ko access nhi kr sakte h.
*/