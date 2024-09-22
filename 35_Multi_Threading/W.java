//Example of DeadLock(never ending)Condition.
class W {
    //main method
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();

        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
/*OUTPUT: DEADLOCK Condition occur kyuki Thread khud ko hi join kr rha h,matlab bol rha h ki jub tak me marunga
nhi tab tak me jiyunga nhi.

D:\javaprac\35_Multi_Threading>javac W.java

D:\javaprac\35_Multi_Threading>java W
^C
D:\javaprac\35_Multi_Threading>java W
^C
 */
