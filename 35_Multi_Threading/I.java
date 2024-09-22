class TThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t.getName());
    }
}

class I {
    //main method
    public static void main(String[] args) {
        TThread a = new TThread();
        a.setName("chotaBheem");

        TThread b = new TThread();
        b.setName("Raju");

        TThread c = new TThread();
        c.setName("Kaliya");

        a.start();
        b.start();
        c.start();
    }
}
/*OUTPUT:
D:\javaprac\35_Multi_Threading>java I
chotaBheem
Kaliya
Raju

D:\javaprac\35_Multi_Threading>java I
Raju
Kaliya
chotaBheem

D:\javaprac\35_Multi_Threading>java I
chotaBheem
Kaliya
Raju

D:\javaprac\35_Multi_Threading>java I
Kaliya
chotaBheem
Raju
 */