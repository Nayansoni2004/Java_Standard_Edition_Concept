class HH {
    static void pro() {

    }
}

class GG extends HH {
    static void pro() {

    }
}

/*
This code compiles successfully because both methods are static, which means this is not method overriding, it's called method hiding.

In method hiding:
The method in the subclass does not override the one in the parent.
The method that gets called depends on the reference type, not the object type (no dynamic method dispatch).
So, overriding does not happen here.
 */