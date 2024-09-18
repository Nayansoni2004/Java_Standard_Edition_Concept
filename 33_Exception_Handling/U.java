import java.io.IOException;

class U {
    //main method
    public static void main(String[] args) {

        System.out.println(1);

        if(12 < 13) {
            //kya-kya hum throw kr sakte h....
            //throw new ArithmeticException();
            //throw new ClassCastException();
            //throw new IOException();
            //throw new Exception();
            //throw new Error();
            //throw new AssertionError();
            //throw new RuntimeException();

            throw new U();
        }

        System.out.println(2);
    }
}
/*OUTPUT: throw keyword ki madat se hum kewal throwable or jo bhi classes throwable k inheritance tree m aate h,
kewal unka hi object bana k throw kr sakte h,or kisi class ka object jo throwable direct ya indirect child nhi h,
uska object bana k throw nhi kr sakte,java allow nhi krta h!!

D:\javaprac\33_Exception_Handling>javac U.java
U.java:19: error: incompatible types: U cannot be converted to Throwable
            throw new U();
            ^
1 error

D:\javaprac\33_Exception_Handling>java U
1
Exception in thread "main" java.lang.ArithmeticException
        at U.main(U.java:9)

D:\javaprac\33_Exception_Handling>java U
1
Exception in thread "main" java.lang.ClassCastException
        at U.main(U.java:10)

D:\javaprac\33_Exception_Handling>javac U.java
U.java:13: error: unreported exception IOException; must be caught or declared to be thrown
            throw new IOException();
            ^
1 error

D:\javaprac\33_Exception_Handling>javac U.java
U.java:14: error: unreported exception Exception; must be caught or declared to be thrown
            throw new Exception();
            ^
1 error

D:\javaprac\33_Exception_Handling>java U
1
Exception in thread "main" java.lang.Error
        at U.main(U.java:15)

D:\javaprac\33_Exception_Handling>java U
1
Exception in thread "main" java.lang.AssertionError
        at U.main(U.java:16)

D:\javaprac\33_Exception_Handling>java U
1
Exception in thread "main" java.lang.RuntimeException
        at U.main(U.java:17)
 */