// Example of DeadLock(Never-Ending)condition. press:ctrl + c -> stop at cmd window.
class P {
    static Q1 x = new Q1();
    static Q2 y = new Q2();
    //main method
    public static void main(String[] args) {
        Thread a = new Thread(new E1Runnable() , "jiyan");
        Thread b = new Thread(new E2Runnable() , "Nobita");
        a.start();
        b.start();
    }
}
class E1Runnable implements Runnable {
    public void run() { 
        Thread t = Thread.currentThread();
        synchronized(P.x) {
            try { Thread.sleep(10); } catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(P.y) {
                System.out.println(t.getName() + " --- ");
            }
        }
    }
}
class E2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        synchronized(P.y) { 
            try { Thread.sleep(10); } catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(P.x) {
                System.out.println(t.getName() + " --- ");
            }
        }
    }
}
class Q1 { }
class Q2 { }
//OUTPUT: DeadLock(Never-Ending Condition)....press ctrl + c -> stop. 