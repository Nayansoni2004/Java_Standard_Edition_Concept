//package declaration.
package a;

//import statement
import b.B;

class A {

    //main method
    public static void main(String[] args) {

        B x = new B();

        x.pro();
    }
}
/* a\A.java:5: error: cannot find symbol
import b.B;
        ^
  symbol:   class B
  location: package b
a\A.java:12: error: cannot find symbol
        B x = new B();
        ^
  symbol:   class B
  location: class A
a\A.java:12: error: cannot find symbol
        B x = new B();
                  ^
  symbol:   class B
  location: class A
3 errors

A class m B class ko access kr rhe h, B class X.java m h,error aai kyuki source file.java ka name or class ka name
match nhi kr rha h,isley java B class ko import or B class k object ko access nhi kr pa rha h. */