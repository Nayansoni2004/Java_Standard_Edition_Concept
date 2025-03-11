interface X {
    void info();
}

class A implements X {
    public void info() {

    }
}

class B extends A implements X {
    public void info() {
        System.out.println("B's implementation of info()");
    }
}

/*
happily compiled...

1. A class that extends another class automatically inherits its implemented interfaces, so implements X in B 
   is unnecessary.
2. A subclass can override an inherited method to provide a different behavior.
 */