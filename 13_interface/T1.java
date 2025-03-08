class A { }

class B { }

class C { }

interface D extends A, B { }

interface E { }

interface F { }

/* 
In Java, an interface can only extend other interfaces, not classes.

D:\javapractice\13_interface> javac T1.java
T1.java:7: error: interface expected here
interface D extends A, B { }
                    ^
T1.java:7: error: interface expected here
interface D extends A, B { }
                       ^
2 errors
 */