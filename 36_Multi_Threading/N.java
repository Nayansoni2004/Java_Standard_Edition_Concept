class N {
    static N q = new N();
    //main method
    public static void main(String[] args) {
        Thread a = new Thread(new D1Runnable() , "Raju");
        Thread b = new Thread(new D2Runnable() , "Kaliya");
        a.start();
        b.start();
    }
    static void aaa() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace(); }
            synchronized(N.q) { System.out.println(t.getName() + " - " + i); }
        }
    }
    static void bbb() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace(); }
            synchronized(N.q) { System.out.println(t.getName() + " - " + i); }
        }
    }
}
class D1Runnable implements Runnable {
    public void run() {
        N.aaa();
    }
}
class D2Runnable implements Runnable {
    public void run() {
        N.bbb();
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java N
Raju - 0
Kaliya - 0
Raju - 1
Kaliya - 1
Raju - 2
Kaliya - 2
Raju - 3
Kaliya - 3
Raju - 4
Kaliya - 4
Raju - 5
Kaliya - 5
Raju - 6
Kaliya - 6
Raju - 7
Kaliya - 7
Raju - 8
Kaliya - 8
Raju - 9
Kaliya - 9
Raju - 10
Kaliya - 10
Raju - 11
Kaliya - 11
Kaliya - 12
Raju - 12
Kaliya - 13
Raju - 13
Kaliya - 14
Raju - 14
Kaliya - 15
Raju - 15
Kaliya - 16
Raju - 16
Kaliya - 17
Raju - 17
Kaliya - 18
Raju - 18
Kaliya - 19
Raju - 19
Kaliya - 20
Raju - 20
Kaliya - 21
Raju - 21
Kaliya - 22
Raju - 22
Kaliya - 23
Raju - 23
Raju - 24
Kaliya - 24
Kaliya - 25
Raju - 25
Raju - 26
Kaliya - 26
Kaliya - 27
Raju - 27
Raju - 28
Kaliya - 28
Raju - 29
Kaliya - 29
 */