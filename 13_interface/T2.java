class A { }

class B { }

class C { }

interface D extends E { }

interface E { }

interface F { }

/*
happily compiled...

A interface can only extends other interface or a number of interfaces using multiple inheritance, which is
applicable only for interfaces.
 */