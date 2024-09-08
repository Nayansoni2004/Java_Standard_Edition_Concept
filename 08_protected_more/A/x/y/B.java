//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class B extends A {
    //main method 
    public static void main(String[] args) {

        //B x = new B();

        A x = new A();

        x.pro();
    }
}
/*
x\y\B.java:15: error: pro() has protected access in A
        x.pro();
         ^
1 error

A class ka member protected h or different package location m inheritance k through access krne m protected member
kewal child class ka object banane se access kr sakte h ,, parent class ka object banane se access nhi kr sakte
kyuki parent class different package m h.
*/