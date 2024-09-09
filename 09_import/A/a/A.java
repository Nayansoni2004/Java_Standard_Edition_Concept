// concept of this code: A class m baith kr different package ki classes ko access kr rhe h (wide card character) ka use kr k. 
//package declaration.
package a;

//import statement
/*
import x.B;
import x.C;
import x.D;
*/
/*B class C class or D class same package location m h isley teeno class ko alag alag import likhne se aacha,wide 
card character ka use kr k teeno class ko 1 bar m hi import kr lenge, */
import x.*;

class A {

    //main method
    public static void main(String[] args) {

        B x = new B();

        C y = new C();

        D z = new D();
    }
}
/* OUTPUT:D:\javaprac\9_import\A>javac a/A.java

D:\javaprac\9_import\A>java a/A

happily compiled, but kuch print nhi hua kyuki humne B C or D class k andar kuch likha hi nhi h.
*/
