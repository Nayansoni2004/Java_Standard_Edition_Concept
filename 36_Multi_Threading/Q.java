class Q {
    //main method
    public static void main(String[] args) {
        Thread t1 = new Thread(new F1Runnable() , "Dholu");
        Thread t2 = new Thread(new F2Runnable() , "Bholu");
        t1.start();
        t2.start();
    }
}
class F1Runnable implements Runnable {
    public void run() {
        synchronized(AA.class) {
            Thread t = Thread.currentThread();
            for(int i = 0 ; i < 30 ; i++) {
                System.out.println(t.getName() + " - " + i);
            }
        }
    }
}
class F2Runnable implements Runnable {
    public void run() {
        AA.pro();
    }
}
class AA {
    static synchronized void pro() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Q
Dholu - 0
Dholu - 1
Dholu - 2
Dholu - 3
Dholu - 4
Dholu - 5
Dholu - 6
Dholu - 7
Dholu - 8
Dholu - 9
Dholu - 10
Dholu - 11
Dholu - 12
Dholu - 13
Dholu - 14
Dholu - 15
Dholu - 16
Dholu - 17
Dholu - 18
Dholu - 19
Dholu - 20
Dholu - 21
Dholu - 22
Dholu - 23
Dholu - 24
Dholu - 25
Dholu - 26
Dholu - 27
Dholu - 28
Dholu - 29
Bholu - 0
Bholu - 1
Bholu - 2
Bholu - 3
Bholu - 4
Bholu - 5
Bholu - 6
Bholu - 7
Bholu - 8
Bholu - 9
Bholu - 10
Bholu - 11
Bholu - 12
Bholu - 13
Bholu - 14
Bholu - 15
Bholu - 16
Bholu - 17
Bholu - 18
Bholu - 19
Bholu - 20
Bholu - 21
Bholu - 22
Bholu - 23
Bholu - 24
Bholu - 25
Bholu - 26
Bholu - 27
Bholu - 28
Bholu - 29 */

/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Q
Bholu - 0
Bholu - 1
Bholu - 2
Bholu - 3
Bholu - 4
Bholu - 5
Bholu - 6
Bholu - 7
Bholu - 8
Bholu - 9
Bholu - 10
Bholu - 11
Bholu - 12
Bholu - 13
Bholu - 14
Bholu - 15
Bholu - 16
Bholu - 17
Bholu - 18
Bholu - 19
Bholu - 20
Bholu - 21
Bholu - 22
Bholu - 23
Bholu - 24
Bholu - 25
Bholu - 26
Bholu - 27
Bholu - 28
Bholu - 29
Dholu - 0
Dholu - 1
Dholu - 2
Dholu - 3
Dholu - 4
Dholu - 5
Dholu - 6
Dholu - 7
Dholu - 8
Dholu - 9
Dholu - 10
Dholu - 11
Dholu - 12
Dholu - 13
Dholu - 14
Dholu - 15
Dholu - 16
Dholu - 17
Dholu - 18
Dholu - 19
Dholu - 20
Dholu - 21
Dholu - 22
Dholu - 23
Dholu - 24
Dholu - 25
Dholu - 26
Dholu - 27
Dholu - 28
Dholu - 29
 */