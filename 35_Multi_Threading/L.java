class HThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class L {
    //main method
    public static void main(String[] args) {
        HThread x = new HThread();

        x.start();
        x.start();
    }
}
/*OUTPUT:
Exception in thread "main" Thread-0
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:802)
        at L.main(L.java:13)
 */