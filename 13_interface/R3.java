class A extends D, E { }

class B { }

class C { }

interface D { }

interface E { }

interface F { }

/*
 a class can extend only one class but can implement multiple interfaces.
 "Fixed incorrect inheritance: changed 'extends' to 'implements' for interfaces."
 
D:\javapractice\13_interface> javac R3.java
R3.java:1: error: '{' expected
class A extends D, E { }
                 ^
1 error
 */