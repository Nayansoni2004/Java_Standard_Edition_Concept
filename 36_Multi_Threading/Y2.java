//Concept: Default Thread obj. "main" main ThreadGroup ka part hota h.
class Y2 {
    //main method
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        System.out.println("Default Thread Group: " + tg.getName());

        tg.list();
    }    
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Y2
Default Thread Group: main
java.lang.ThreadGroup[name=main,maxpri=10]
    Thread[main,5,main]
 */