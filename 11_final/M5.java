class M5 {

    final char a;//variable declaration

    void abc() {
        a = 'A';
    }
}
/* M5.java:6: error: cannot assign a value to final variable a
        a = 'A';
        ^
1 error

CONCLUSION: it's too late to initialize a final variable with some value, inside method abc().
*/