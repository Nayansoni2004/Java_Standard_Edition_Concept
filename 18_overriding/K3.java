class G1 {
    Animal pro() {
        return null;
    }
}

class G2 extends G1 {
    Cat pro() {
        return null;
    }
}
/*
happily compiled...
In method overriding, if return type of overridden method is of class type(non-primitive) then the overriding 
version in child can return the same as well as its subclass type.
 */