class BThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            if(i == 15) {
                setDaemon(true);//setDaemon() ko start call krne se pahle call krna h,baad m krenge to Exception!
            }
            System.out.println(t.getName() +  " - " + i);
        }
    }
}
class U1 {
    // main method
    public static void main(String[] args) {
        BThread x = new BThread();
        x.setName("Golu");
        x.start();
    }
}
/*OUTPUT:pahle Golu - 14 tak print ho jayega,fir jese hi i ki value 15 hogi to IllegalThreadStateException aayega!
D:\javaprac\36_Multi_Threading>javac U1.java

D:\javaprac\36_Multi_Threading>java U1
Golu - 0
Golu - 1
Golu - 2
Golu - 3
Golu - 4
Golu - 5
Golu - 6
Golu - 7
Golu - 8
Golu - 9
Golu - 10
Golu - 11
Golu - 12
Golu - 13
Golu - 14
Exception in thread "Golu" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
        at BThread.run(U1.java:6)  */