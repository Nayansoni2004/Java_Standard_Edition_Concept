class A {
    //Allowed Characters: A-Z, a-z, 0-9, $ and _
    void _2a() {
        // second character can be numeric
    }

    int y2345678 = 677;  // second character can be numeric
}

class _$Ta2 {
    // _ & $ is allowed as a first character
}

/*
happily compiled...

D:\javapractice\14_identifiers> javac A.java
 */