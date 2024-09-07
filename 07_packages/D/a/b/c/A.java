//package declaration.
package a.b.c;

//import statement.
import x.y.B;

class A {
    //main method...
    public static void main(String[] args) {
        
        B b = new B();

        b.pro();
    }
}

//happily compiled but not runed because method inside B class is not defined as public.
/* D:\javaprac\7_packages\D>javac a/b/c/A.java
a\b\c\A.java:13: error: pro() is not public in B; cannot be accessed from outside package
        b.pro();
         ^
1 error */