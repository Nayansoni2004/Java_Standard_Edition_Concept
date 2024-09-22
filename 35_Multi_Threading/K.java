class MyRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(x.getName() + " - " + i);
        }
    }
}

class K {
    // main method
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);
        t.setName("mohan");

        t.start();

        Thread x = Thread.currentThread(); //Default thread : jis m main method stackup hoti h.

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(x.getName() + " - " + i);
        }
    }
}
/*OUTPUT: har bar run krne bar kabhi mohan last m end hota h,to kabhi main last m end hota h,kyuki two thread
ban jayenge 1 default thread or 1 start call krne se jo new thread bana h wo,or uske name m "Thread-0" ki jagah
mohan assign ho jayega,then PROCESS SCHEDULAR kabhi mohan Thread ko chance dega to kabhi main Thread ko ,but
dono Thread apna execution complete krenge. 
 */