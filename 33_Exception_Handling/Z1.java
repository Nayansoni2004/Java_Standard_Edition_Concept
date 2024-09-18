class Z1 {
    //main method
    public static void main(String[] args) {

        Thread x = new Thread();

        x.start();
        x.start();

    }
}
/*OUTPUT: agar Thread class ki start() method ko 1 se jada bar call krenge to Exception aayega.


D:\javaprac\33_Exception_Handling>java Z1
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:802)
        at Z1.main(Z1.java:8)
 */