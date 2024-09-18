//CONCEPT: thow keyword:which is used to make the object of any exception class by own & throw it by using throw 
//keyword. but throw likhne k baad ka code run nhi hota.
class T {
    //main method
    public static void main(String[] args) {
        
        System.out.println(1);

        ArithmeticException e = new ArithmeticException();

        throw e;

        System.out.println(2);
    }
}
/*OUTPUT:
D:\javaprac\33_Exception_Handling>javac T.java
T.java:13: error: unreachable statement
        System.out.println(2);
        ^
1 error
 */