import java.io.FileNotFoundException;

class X6 {
    void pro() {
        System.out.println("Hello");
    }
}

class Y6 extends X6 {
    // illegal method over-riding:NEWER case!!!
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}
/*OUTPUT: illegal h,NEWER Exception is not Allowed!!!

D:\javaprac\34_Exception_Handling>javac I.java
I.java:11: error: pro() in Y6 cannot override pro() in X6
    void pro() throws FileNotFoundException {
         ^
  overridden method does not throw FileNotFoundException
1 error
 */