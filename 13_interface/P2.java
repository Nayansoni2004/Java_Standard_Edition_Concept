interface Smart {

}

interface Intelligent {

}

interface Beautiful {

}

class Human {

}

class American implements Smart, Intelligent, Beautiful extends Human {
    
}

/*
An interface can extend another interface, but it cannot implement or extend a class.

D:\javapractice\13_interface> javac P2.java
P2.java:17: error: '{' expected
class American implements Smart, Intelligent, Beautiful extends Human {
                                                       ^
1 error
 */