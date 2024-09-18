class W1 extends Exception {
    //main method
    public static void main(String[] args) {

        throw new W1();

    }    
}
/*OUTPUT:
D:\javaprac\33_Exception_Handling>javac W1.java
W1.java:5: error: unreported exception W1; must be caught or declared to be thrown
        throw new W1();
        ^
1 error
 */