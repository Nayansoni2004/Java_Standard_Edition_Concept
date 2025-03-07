class A implements B, C {  }

class B { }

class C { }

interface D { }

interface E { }

interface F { }

/*
In Java, the implements keyword is used only for interfaces, not for classes.

D:\javapractice\13_interface> javac S1.java
S1.java:1: error: interface expected here
class A implements B, C {  }
                   ^
S1.java:1: error: interface expected here
class A implements B, C {  }
                      ^
2 errors
 */