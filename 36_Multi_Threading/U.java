class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
class U {
    //main method 
    public static void main(String[] args) {
        AThread x = new AThread();
        x.setName("Golu");
        x.start();

        x.setDaemon(true);
//setDaemon()method ko start() call krne se pahle call krna h,start()call krne k bad nhi,nhi to Exception aayega!
    }    
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java U
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
        at U.main(U.java:16)
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
Golu - 15
Golu - 16
Golu - 17
Golu - 18
Golu - 19
Golu - 20
Golu - 21
Golu - 22
Golu - 23
Golu - 24
Golu - 25
Golu - 26
Golu - 27
Golu - 28
Golu - 29   */