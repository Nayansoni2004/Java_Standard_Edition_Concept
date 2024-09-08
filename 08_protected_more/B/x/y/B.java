//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class B extends A {

    //main method 
    public static void main(String[] args) {

        B x = new B();

        x.pro();
    }
}
/* OUTPUT:protected member is accessed

A class ka member protected h or different package m B class m us protected member ko access kr rhe h Child banke
or kyuki B class different package m h isley import krna padega A class ko or kewal B class ka hi object bna k 
access kr sakte h. */ 