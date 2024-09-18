import java.io.IOException;

class U1 extends RuntimeException {
    //main method
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13) {
            //throw new ArithmeticException();
            //throw new ClassCastException();
            //throw new IOException();
            //throw new Exception();
            //throw new Error();
            //throw new AssertionError();
            //throw new RuntimeException();

            throw new U1();
        }

        System.out.println(2);
    }
}
/*OUTPUT: agar hum apni class ko kisi exception class ka child bana le to hum apni class ka object bhi throw kr
sakte h...

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.lang.ArithmeticException
        at U1.main(U1.java:10)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.lang.ClassCastException
        at U1.main(U1.java:11)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.io.IOException
        at U1.main(U1.java:12)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.lang.Exception
        at U1.main(U1.java:13)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.lang.Error
        at U1.main(U1.java:14)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.lang.AssertionError
        at U1.main(U1.java:15)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" java.lang.RuntimeException
        at U1.main(U1.java:16)

D:\javaprac\33_Exception_Handling>javac U1.java

D:\javaprac\33_Exception_Handling>java U1
1
Exception in thread "main" U1
        at U1.main(U1.java:18)
 */