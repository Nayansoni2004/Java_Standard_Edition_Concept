//DeadLock(Never-Ending)condition.
class R {
    static BB x = new BB();
    static BB y = new BB();
    //main method
    public static void main(String[] args) {
        Thread t1 = new Thread(new G1Runnable() , "Doraemon");
        Thread t2 = new Thread(new G2Runnable() , "Nobita");
        t1.start();  t2.start();
    }
}
class G1Runnable implements Runnable {
    public void run() {
        R.x.pro();
    }
}
class G2Runnable implements Runnable {
    public void run() {
        R.y.info();
    }
}
class BB {
    synchronized void pro() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            if(i == 15) {
                R.y.info();
            }
            System.out.println(t.getName() + " - " + i);
        }
    }
    synchronized void info() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            if(i == 15) {
                R.x.pro();
            }
            System.out.println(t.getName() + " - " + i);
        }
    }
}
/*OUTPUT: mixed ouput aayega i ki value 14 tak jese hi 15 ho jayegi i ki value DeadLock(Never-Ending)condition
//occur hogi.ctrl + c <- stop.
D:\javaprac\36_Multi_Threading>java R
Doraemon - 0
Doraemon - 1
Doraemon - 2
Doraemon - 3
Nobita - 0
Nobita - 1
Nobita - 2
Doraemon - 4
Doraemon - 5
Doraemon - 6
Nobita - 3
Nobita - 4
Nobita - 5
Doraemon - 7
Doraemon - 8
Nobita - 6
Nobita - 7
Doraemon - 9
Doraemon - 10
Nobita - 8
Nobita - 9
Nobita - 10
Nobita - 11
Nobita - 12
Nobita - 13
Nobita - 14
Doraemon - 11
Doraemon - 12
Doraemon - 13
Doraemon - 14
^C
 */