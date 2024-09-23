//concept: Default ThreadGroup main ka parent ThreadGroup ka name system ThreadGroup h.
class Y3 {
    //main method
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup().getParent();
        //Default ThreadGroup ka parent ThreadGroup ka name print hoga.
        System.out.println("Default ThreadGroup's Parent ThreadGroup: " + tg.getName());

        tg.list();
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Y3
Default ThreadGroup's Parent ThreadGroup: system
java.lang.ThreadGroup[name=system,maxpri=10]
    Thread[Reference Handler,10,system]
    Thread[Finalizer,8,system]
    Thread[Signal Dispatcher,9,system]
    Thread[Attach Listener,5,system]
    Thread[Notification Thread,9,system]
    java.lang.ThreadGroup[name=main,maxpri=10]
        Thread[main,5,main]
    java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
        Thread[Common-Cleaner,8,InnocuousThreadGroup]  */