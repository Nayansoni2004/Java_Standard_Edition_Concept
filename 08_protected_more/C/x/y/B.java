//package declaration
package x.y;

//import statement.
import a.b.c.A;

public class B extends A {

    //main method
    public static void main(String[] args) {

        B x = new B();

        x.pro();
    }
}
/* OUTPUT: protected member is accessed

A class ka member protected h or Different package m h or B class different package m h to A class ko import krna 
padega or protected member ko different package ka kewal Child banke access kr sakte h,, or A class different 
package m h isley child class ka hi object bana k access kr sakte h.  */ 