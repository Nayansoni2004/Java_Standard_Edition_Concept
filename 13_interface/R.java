class A extends B {

}

class B { }

class C { }

interface D { }

interface E { }

interface F { }

/*
This compiles and runs successfully because Java compiles the entire file at once.
Java does NOT require the parent class to be declared first, as long as it's in the same file.
However, for better readability and convention, it's recommended to declare the parent class first.
 */