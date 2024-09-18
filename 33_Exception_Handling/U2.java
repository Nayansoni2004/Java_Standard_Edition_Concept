import java.io.IOException;

class U2 {
    //main method
    public static void main(String[] args) throws Throwable {

        System.out.println(1);

        if(12 < 13) {
            throw new Object();
        }

        System.out.println(2);
    }
}
/*OUTPUT:
D:\javaprac\33_Exception_Handling>javac U2.java
U2.java:10: error: incompatible types: Object cannot be converted to Throwable
            throw new Object();
            ^
1 error
 */