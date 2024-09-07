//package declaration:means defining file ka path.but root folder nhi likhte h wo already le leta h.
package a.b.c;
//import statement:class definition k pahle or package declaration k baad likhte h.
import x.y.B;

class A {
    //main method...
    public static void main(String[] args) {
        B b;
    }
}
//is class m jis class ko access kr rhe h us class ka object banate h.
//OUTPUT:A class is happily compiled and B class is accessed in class A.

/*D:\javaprac\7_packages\A>javac a/b/c/A.java

D:\javaprac\7_packages\A>java a/b/c/A */