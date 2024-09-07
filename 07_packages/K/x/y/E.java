//package declaration.
package x.y;

//import statement.
import a.b.c.A;

class E extends A {

    //main method 
    public static void main(String[] args) {

        System.out.println("Bye");
    }
}
/*
x\y\E.java:5: error: A is not public in a.b.c; cannot be accessed from outside package
import a.b.c.A;
            ^
x\y\E.java:7: error: A is not public in a.b.c; cannot be accessed from outside package
class E extends A {
                ^
2 errors
##conclusion:------
A class public nhi h to A class E class ka parent nhi ban sakta h or A class default mark h isley different package
location m inheritance k through accessible nhi h.
*/