class A { }

class B { }

class C { }

interface D extends E, F { }

interface E { }

interface F { }

/*
happily compiled...

java supports multiple inheritance only for interfaces, that is a interface can extends multiple interfaces.
 */