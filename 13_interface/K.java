interface K {
    int x;

}
/* 
In Java, interface variables must be initialized at the time of declaration because they are implicitly public 
static final.

PS D:\javapractice\13_interface> javac K.java
K.java:2: error: = expected
    int x;
         ^
1 error
*/