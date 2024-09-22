class ZThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("Inside ZThread run method: " + x);
    }
}
class H {
    //main method
    public static void main(String[] args) {
        ZThread t = new ZThread();
        t.setName("Bablu");

        t.start();
    }
}
/*OUTPUT:
Inside ZThread run method: Thread[Bablu,5,main]
 */