abstract class X {  }

class XY extends X {  }

class N {
    public static void main(String[] args) {
        // Case 3:
        // X x = new XY();
        
        // Case 2:
        // X x = new X();
        // N.java:8: error: X is abstract; cannot be instantiated
        // X x = new X();
        //       ^
        // 1 error

        // Case 1:
        // X x; 
    }
}
/*
happily compiled in Case 1 & in Case 3.
compilation failed in Case 2.
 */
// 🧠 Summary:
// Abstract classes can have references, but can't be instantiated directly.

// Subclasses that implement/extend abstract classes can be instantiated.

// Case 3 is an example of runtime polymorphism (using superclass reference to refer to subclass object).