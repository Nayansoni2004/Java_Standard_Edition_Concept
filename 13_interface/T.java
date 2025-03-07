class A { }

class B { }

class C { }

interface D extends A { }

interface E { }

interface F { }

/*
In Java, interfaces can only extend other interfaces, not classes.

D:\javapractice\13_interface> javac T.java
T.java:7: error: interface expected here
interface D extends A { }
                    ^
1 error
 */