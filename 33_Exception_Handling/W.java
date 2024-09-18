class W extends Throwable {
    //main method
    public static void main(String[] args) {

        throw new W();

    }
}
/*OUTPUT:
D:\javaprac\33_Exception_Handling>javac W.java
W.java:5: error: unreported exception W; must be caught or declared to be thrown
        throw new W();
        ^
1 error
 */