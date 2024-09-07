//package declaration.
package a.b.c;

//import statement.
import x.y.B;

class A {
    //main method...
    public static void main(String[] args) {
        B x;
    }
}
/*A.java file ko B class visible to ho gyi h import statement likhne se but accessibility nhi h kyuki B class public 
nhi h isley package k bahar accessible nhi h*/ 

/*a\b\c\A.java:5: error: B is not public in x.y; cannot be accessed from outside package
import x.y.B;
          ^
a\b\c\A.java:10: error: B is not public in x.y; cannot be accessed from outside package
        B x;
        ^
2 errors*/