class BRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name: " + t.getName() + " Thread Priority: " + t.getPriority());
        t.setPriority(3);
        Thread x = new Thread(new B1Runnable() , "B");
        x.start();
    }
}
class B1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name: " + t.getName() + " Thread Priority: " + t.getPriority());

    }
}
class B {
    // main method
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name: " + t.getName() + " Thread Priority: " + t.getPriority());

        Thread x = new Thread(new BRunnable() , "A");
        x.start();
    }
}
/*OUTPUT:
Thread Name: main Thread Priority: 5
Thread Name: A Thread Priority: 5
Thread Name: B Thread Priority: 3
 */