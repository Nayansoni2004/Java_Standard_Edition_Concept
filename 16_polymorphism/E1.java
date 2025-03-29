class Y1 {
    void talk() {
        System.out.println("I can talk");
    }
}

class Y2 extends Y1 {
    void walk() {
        System.out.println("I can walk");
    }
}

class Y3 extends Y2 {
    void laugh() {
        System.out.println("I can laugh");
    }
}

class E1 {
    public static void main(String[] args) {
        Y2 x = new Y3();

        x.laugh();
        x.walk();
        x.talk();
        System.out.println(x.toString());
    }
}
/*
In Java, when using polymorphism with a parent class reference (Y2 x = new Y3();), the reference variable (x) can only access:

Methods that are declared in the parent class (Y2)

Methods inherited from its parent (Y1)

However, it cannot access child-specific methods like laugh() from Y3 because:

At compile time, Java checks the reference type (Y2) for available methods, not the actual object type (Y3).

Since laugh() is not declared in Y2 or its parent (Y1), it results in a compilation error.

This is called reference type limitation in polymorphism.

E1.java:23: error: cannot find symbol
        x.laugh();
         ^
  symbol:   method laugh()
  location: variable x of type Y2
1 error
 */