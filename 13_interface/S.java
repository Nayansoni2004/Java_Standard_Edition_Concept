class A implements B { }

class B { }

class C { }

interface D { }

interface E { }

interface F { }

/*  
In Java, the implements keyword is used only for interfaces, not for classes.

D:\javapractice\13_interface> javac S.java
S.java:1: error: interface expected here
class A implements B { }
                   ^
1 error
*/