class Y {
    //main method
    public static void main(String[] args) {

        Thread t = new Thread("abc");
        // t.setPriority(2);
        t.setPriority(21);

        // thread Priority range lies b/w 0-10.

    }
}
/* 
OUTPUT:kyuki thread priority ki range value 0 se 10 tak hi hoti h,islye Exception aayega IllegalArgumentException.

D:\javaprac\33_Exception_Handling>java Y
Exception in thread "main" java.lang.IllegalArgumentException
        at java.base/java.lang.Thread.setPriority(Thread.java:1149)
        at Y.main(Y.java:7)
*/