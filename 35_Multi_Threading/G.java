class YThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("Inside YThread run method: " + x);
    }
}
class G {
    //main method
    public static void main(String[] args) {
        YThread t = new YThread();
        t.setName("Golu");

        t.run();
    }
}
/*OUTPUT:
Inside YThread run method: Thread[main,5,main]
 */