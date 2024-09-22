//Note:Threads ki priority matter nhi krti,kyuki PROCESS SCHEDULAR sub ka BOSS h,wo sabhi Threads ko fair turn 
//taking deta h.
//MSG: java-thread-Priority-has-no-effect. 
class JRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class Y {
    // main method
    public static void main(String[] args) {
        Thread a = new Thread(new JRunnable(), "A");
        Thread b = new Thread(new JRunnable(), "B");
        Thread c = new Thread(new JRunnable(), "C");

        a.setPriority(1);
        b.setPriority(7);
        c.setPriority(3);

        a.start();
        b.start();
        c.start();
    }
}
/*OUTPUT:Every thread has a priority. When there is competition for processing resources, threads with higher 
priority are generally executed in preference to threads with lower priority. Such preference is not, however,
a guarantee that the highest priority thread will always be running, and thread priorities cannot be used to 
reliably implement mutual exclusion.

D:\javaprac\35_Multi_Threading>java Y
A - 0
C - 0
B - 0
B - 1
A - 1
B - 2
B - 3
B - 4
C - 1
C - 2
C - 3
C - 4
C - 5
C - 6
C - 7
C - 8
C - 9
C - 10
C - 11
B - 5
B - 6
B - 7
B - 8
B - 9
A - 2
A - 3
A - 4
A - 5
A - 6
A - 7
A - 8
B - 10
B - 11
B - 12
B - 13
B - 14
B - 15
B - 16
C - 12
C - 13
C - 14
C - 15
B - 17
B - 18
A - 9
A - 10
A - 11
A - 12
B - 19
C - 16
B - 20
A - 13
B - 21
B - 22
A - 14
C - 17
A - 15
B - 23
A - 16
C - 18
A - 17
B - 24
A - 18
A - 19
A - 20
A - 21
A - 22
C - 19
C - 20
C - 21
C - 22
C - 23
C - 24
C - 25
C - 26
C - 27
C - 28
A - 23
A - 24
B - 25
A - 25
C - 29
A - 26
B - 26
B - 27
A - 27
B - 28
A - 28
A - 29
B - 29
 */