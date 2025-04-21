class G1 {
    Animal pro() {
        return null;
    }
}

class G2 extends G1 {
    BDog pro() {
        return null;
    }
}
/*
happily compiled...
Implemented covariant return type in method overriding using multilevel inheritance: BDog -> Dog -> Animal.
 */