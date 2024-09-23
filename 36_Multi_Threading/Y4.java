class Y4 {
    //main method
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("QUAD");
        Thread t1 = new Thread(tg , new XRunnable() , "Bharat");
        Thread t2 = new Thread(tg , new XRunnable() , "US");
        Thread t3 = new Thread(tg , new XRunnable() , "Australia");
        Thread t4 = new Thread(tg , new XRunnable() , "Japan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
                 //threadgroupparent(tgp)
        ThreadGroup tgp = Thread.currentThread().getThreadGroup().getParent();

        System.out.println("Default ThreadGroup parent ThreadGroup: " + tgp.getName());

        tgp.list();
    }
}
class XRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(1000); }
        catch(InterruptedException e) { e.printStackTrace(); }
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Y4
Default ThreadGroup parent ThreadGroup: system
java.lang.ThreadGroup[name=system,maxpri=10]
    Thread[Reference Handler,10,system]
    Thread[Finalizer,8,system]
    Thread[Signal Dispatcher,9,system]
    Thread[Attach Listener,5,system]
    Thread[Notification Thread,9,system]
    java.lang.ThreadGroup[name=main,maxpri=10]
        Thread[main,5,main]
        java.lang.ThreadGroup[name=QUAD,maxpri=10]
            Thread[Bharat,5,QUAD]
            Thread[US,5,QUAD]
            Thread[Australia,5,QUAD]
            Thread[Japan,5,QUAD]
    java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
        Thread[Common-Cleaner,8,InnocuousThreadGroup]   */
        
/*Concept: system ThreadGroup ka child ThreadGroup main h ,jo ki default ThreadGroup h,kyuki is Default 
           ThreadGroup m default thread of execution banata h,or is main ThreadGroup ka child ThreadGroup 
           humne banaya h,jiska name QUAD h,or list() method is QUAD ThreadGroup k jitne bhi Thread of execution
           h unke name print kr rhi h. */