import java.io.FileNotFoundException;
import java.io.EOFException;

class X8 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}

class Y8 extends X8 {
    //illegal method over-riding:NEWER case!!!
    void pro() throws EOFException { //over-riding method m naya exception matlab NEWER nhi likh sakte h,illegal h.
        System.out.println("Hello");
    }
}
/*OUTPUT: NEWER Exception matlab naya Exception over-riding method m nhi likh sakte,java does not allow!!!

D:\javaprac\34_Exception_Handling>javac K.java
K.java:12: error: pro() in Y8 cannot override pro() in X8
    void pro() throws EOFException { //over-riding method m naya exception matlab NEWER nhi likh sakte h,illegal h.
         ^
  overridden method does not throw EOFException
1 error
 */