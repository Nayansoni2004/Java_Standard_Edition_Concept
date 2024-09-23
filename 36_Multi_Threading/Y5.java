//Concept: kisi ThreadGroup m no. of active threads of execution find list() method k through krte h. 
class Y5 {
    //main method
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("QUAD"); //our own ThreadGroup
        Thread t1 = new Thread(tg , new XRunnable() , "Bharat"); //constructor
        Thread t2 = new Thread(tg , new XRunnable() , "US"); //constructor
        Thread t3 = new Thread(tg , new XRunnable() , "Australia"); //constructor
        Thread t4 = new Thread(tg , new XRunnable() , "Japan"); //constructor

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Quad Thread: " + tg.getName());
//activeCount()method current thread jis ThreadGroup m bana h,us ThreadGroup k no. of active threads batati h.
        System.out.println(tg.activeCount());  //return type int,static method h.
        tg.list();
    }
}
class XRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(20); }
        catch(InterruptedException e) { e.printStackTrace(); }
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Y5
Quad Thread: QUAD
4   //no. of active threads in QUAD ThreadGroup, jo ki 4 h. 
java.lang.ThreadGroup[name=QUAD,maxpri=10]
    Thread[Bharat,5,QUAD]
    Thread[US,5,QUAD]
    Thread[Australia,5,QUAD]
    Thread[Japan,5,QUAD]
 */