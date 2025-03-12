class C1 {
    void 0A_2() {
        /* Invalid method name: Identifiers cannot start with a digit. Java requires 
        method names to begin with a letter, _, or $. */
    }
}

/*
D:\javapractice\14_identifiers> javac C1.java
C1.java:2: error: <identifier> expected
    void 0A_2() {
        ^
C1.java:2: error: '(' expected
    void 0A_2() {
         ^
C1.java:2: error: invalid method declaration; return type required
    void 0A_2() {
          ^
3 errors
 */