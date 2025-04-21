class G1 {
    Animal pro() {
        return null;
    }
}

class G2 extends G1 {
    Animal pro() {
        return null;
    }
}
/*
happily compiled...
CONCLUSION: In method overriding, if the return type is a class type (non-primitive), then the overriding method
            can return the same class type or a subclass (covariant return type). Returning null is valid 
            because null is a valid value for any object type.
 */