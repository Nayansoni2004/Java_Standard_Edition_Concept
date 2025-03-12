class a#&^ {  // #, &, and ^ are not allowed in class names.
    void *^3() {
        // Method names cannot start with special characters like * or ^.
    }

    int -./ = 989; // Variable names cannot contain operators (-, /, .).
}

/*
D:\javapractice\14_identifiers> javac B.java
B.java:1: error: illegal character: '#'
class a#&^ {
       ^
B.java:2: error: <identifier> expected
    void *^3() {
        ^
B.java:2: error: '(' expected
    void *^3() {
         ^
B.java:6: error: <identifier> expected
    int -./ = 989;
       ^
4 errors
 */