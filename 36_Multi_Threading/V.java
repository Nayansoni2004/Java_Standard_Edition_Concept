/*Conclusion:jese hi "main" thread ka job khatam ho jayega,golu thread ki saase bhi tham jayenge,kyuki humne 
             setDaemon()method call kia h.*/ 
class CThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
class V {
    // main method
    public static void main(String[] args) {
        CThread x = new CThread();
        x.setName("Golu");
        x.setDaemon(true); //setDaemon() method hamesha start() method call krne se pahle call krna padti h.
        x.start();

        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java V
main - 0
main - 1
Golu - 0
main - 2
Golu - 1
main - 3
Golu - 2
main - 4
main - 5
Golu - 3
main - 6
Golu - 4
main - 7
Golu - 5
main - 8
Golu - 6
main - 9
Golu - 7
Golu - 8
Golu - 9
 */