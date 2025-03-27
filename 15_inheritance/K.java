//Hybrid Inheritance

class X {  }

interface Y {  }

class A extends X implements Y {  }

class B extends A {  }

class C extends B {  }

class D extends B {  }

/*
happily compiled....

when a class extends another class and also implements a interface, is called a Hybrid Inheritance.
 */