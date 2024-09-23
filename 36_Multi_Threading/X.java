/*Default Thread m baith kr jitne bhi Thread banate h,wo sub Thread bhi main Thread group ka hi part hote h,
  kyuki Default Thread "main" main Thread group ka part hota h. */
class X {
    //main method
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        ThreadGroup tg = x.getThreadGroup();

        System.out.println("Default Thread Name: " + x.getName());
        System.out.println("Thread Group's Name of Default Thread: " + tg.getName());
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java X
Default Thread Name: main
Thread Group's Name of Default Thread: main
 */