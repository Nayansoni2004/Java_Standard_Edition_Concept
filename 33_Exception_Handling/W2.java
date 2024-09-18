class W2 extends RuntimeException {
    //main method
    public static void main(String[] args) {

        throw new W2();

    }
}
/*OUTPUT: compilation error nhi aai kyuki RuntimeException unchecked category ka Exception class h.

D:\javaprac\33_Exception_Handling>javac W2.java

D:\javaprac\33_Exception_Handling>java W2
Exception in thread "main" W2
        at W2.main(W2.java:5)
 */