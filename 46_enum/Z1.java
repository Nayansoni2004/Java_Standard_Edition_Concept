/*enum Z1 { <-enum k andar interface nhi bana sakte.
    interface A {

    }
} */

/*enum Z1 { <-enum k andar class nhi bana sakte.
    class A {

    }
} */

enum Z1 { //<-enum k andar enum nhi bana sakte.
    enum A {

    }
}

/*OUTPUT: acc. to java version 11 and 17 enum k andar class,interface ,enum nhi bana sakte.
D:\javaprac\46_enum>javac Z1.java
Z1.java:2: error: enum constant expected here
    interface A {
    ^
1 error

D:\javaprac\46_enum>javac Z1.java
Z1.java:8: error: enum constant expected here
    class A {
    ^
1 error

D:\javaprac\46_enum>javac Z1.java
Z1.java:14: error: enum constant expected here
    enum A {
    ^
1 error
 */