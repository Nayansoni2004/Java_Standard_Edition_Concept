class A { }

class B { }

class C { }

// interface D implements A { }
// interface D implements A, B { }
// interface D implements E { }
interface D implements E, F { }

interface E { }

interface F { }

/*
1. A interface cannot implements a class.
2. A interface cannot implements multiple classes, but can extends multiple interfaces. that is multiple inheritance.
3. A interface cannot implements a interface, it can only extends a interface or interfaces.
4. An interface cannot implement multiple interfaces, but it can extend multiple interfaces.

D:\javapractice\13_interface> javac U.java
U.java:7: error: '{' expected
interface D implements A { }
           ^
1 error
 */