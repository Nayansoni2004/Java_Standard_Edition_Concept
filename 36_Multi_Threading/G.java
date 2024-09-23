//Description:The property of object that is not accessed consistently by methods those methods not be marked synchronized.
class Transaction1 implements Runnable {
    public void run() {
        G.ac.withdraw(10);
    }
}
class Transaction2 implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(G.ac.getaccNum());
    }
}
class G {
    static Account4 ac = new Account4();
    // main method
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Transaction1() , "mohan");
        Thread b = new Thread(new Transaction2() , "sohan");

        a.start();
        Thread.sleep(50);
        b.start();
    }    
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java G
mohan~~~~~~~~~~~~~~~~~~~~~~~~~
4567
mohan~~~~~~~~~~~~~~~~~~~~~~~~~

D:\javaprac\36_Multi_Threading>java G
mohan~~~~~~~~~~~~~~~~~~~~~~~~~
4567
mohan~~~~~~~~~~~~~~~~~~~~~~~~~

D:\javaprac\36_Multi_Threading>java G
mohan~~~~~~~~~~~~~~~~~~~~~~~~~
4567
mohan~~~~~~~~~~~~~~~~~~~~~~~~~
 */