import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class X7 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}

class Y7 extends X7 {
    // illegal method over-riding: WIDER case!!!
    void pro() throws IOException {
        System.out.println("Hello");
    }
}
/*OUTPUT: compilation failed!
    NOTE: wider or naya exception over-riding method m nhi likh sakte h,java does not allow!!!

D:\javaprac\34_Exception_Handling>javac J.java
J.java:13: error: pro() in Y7 cannot override pro() in X7
    void pro() throws IOException {
         ^
  overridden method does not throw IOException
1 error
 */