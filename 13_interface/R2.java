class A extends D { }

class B { }

class C { }

interface D { }

interface E { }

interface F { }

/*
A class cannot extend an interface—it can only implement it.

D:\javapractice\13_interface> javac R2.java
R2.java:1: error: no interface expected here
class A extends D { }
                ^
1 error
 */