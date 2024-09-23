/*Default Thread object pr start() automatic/internally call ho jata h,uske baad hum setDaemon()call kr rhe h,
 isley IllegalThreadStateException aaya,kyuki setDaemon() start call krne k pahle call krna padta h.*/
class U2 {
    //main method
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        t.setDaemon(true);
    }  
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java U2
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
        at U2.main(U2.java:6)
 */