class A extends B, C { }

class B { }

class C { }

interface D { }

interface E { }

interface F { }

/*
Java does not support multiple inheritance using classes, so class A extends B, C is invalid. A class can 
extend only one class but can implement multiple interfaces.

D:\javapractice\13_interface> javac R1.java
R1.java:1: error: '{' expected
class A extends B, C { }
                 ^
1 error
 */