class T {
    //main method
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        boolean flag = x.isDaemon();

        System.out.println(x.getName() + " -thread Is a Daemon thread: " + flag);
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>javac T.java

D:\javaprac\36_Multi_Threading>java T
main -thread Is a Daemon thread: false
 */