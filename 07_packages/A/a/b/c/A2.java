//package declaration.
package a.b.c;

//import statement:
import x.y.B2;

class A2 {
    //main method.
    public static void main(String[] args) {

        B2 b = new B2();

        b.pro();
    }
}

/*OUTPUT:D:\javaprac\7_packages\A>javac a/b/c/A2.java

D:\javaprac\7_packages\A>java a/b/c/A2
The method is successfully accessed!*/