class O {
    static O q = new O();
    //main method
    public static void main(String[] args) {
        Thread a = new Thread(new D1Runnable() , "Raju");
        Thread b = new Thread(new D2Runnable() , "Kaliya");
        a.start();
        b.start();
    }
    static void aaa() {
        Thread t = Thread.currentThread();
        synchronized(O.q) {
            for(int i = 0 ; i < 30 ; i++) {
                try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace(); }
                System.out.println(t.getName() + " - " + i);
            }
        }
    }
    static void bbb() {
        Thread t = Thread.currentThread();
        synchronized(O.q) {
            for(int i = 0 ; i < 30 ; i++) {
                try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace(); }
                System.out.println(t.getName() + " - " + i);
            }
        }
    }
}
class D1Runnable implements Runnable {
    public void run() {
        O.aaa();
    }
}
class D2Runnable implements Runnable {
    public void run() {
        O.bbb();
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java O
Raju - 0
Raju - 1
Raju - 2
Raju - 3
Raju - 4
Raju - 5
Raju - 6
Raju - 7
Raju - 8
Raju - 9
Raju - 10
Raju - 11
Raju - 12
Raju - 13
Raju - 14
Raju - 15
Raju - 16
Raju - 17
Raju - 18
Raju - 19
Raju - 20
Raju - 21
Raju - 22
Raju - 23
Raju - 24
Raju - 25
Raju - 26
Raju - 27
Raju - 28
Raju - 29
Kaliya - 0
Kaliya - 1
Kaliya - 2
Kaliya - 3
Kaliya - 4
Kaliya - 5
Kaliya - 6
Kaliya - 7
Kaliya - 8
Kaliya - 9
Kaliya - 10
Kaliya - 11
Kaliya - 12
Kaliya - 13
Kaliya - 14
Kaliya - 15
Kaliya - 16
Kaliya - 17
Kaliya - 18
Kaliya - 19
Kaliya - 20
Kaliya - 21
Kaliya - 22
Kaliya - 23
Kaliya - 24
Kaliya - 25
Kaliya - 26
Kaliya - 27
Kaliya - 28
Kaliya - 29
 */